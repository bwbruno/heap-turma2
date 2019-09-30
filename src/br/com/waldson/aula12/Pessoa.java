package br.com.waldson.aula12;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private List<Listener> listeners = new ArrayList<Listener>();

    public Pessoa(String nome, int idade) {
        this.nome  = nome;
        this.idade = idade;
    }

    public void setListener(Listener listener) {
        this.listeners.add(listener);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;

        for (Listener li : listeners)
            li.update(this);

        this.listeners.clear();
    }
}
