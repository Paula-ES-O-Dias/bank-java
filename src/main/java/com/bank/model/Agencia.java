package com.bank.model;

public class Agencia {
    private Long id;
    private String nome;
    private String cidade;

    public Agencia () {

    }

    public Agencia (
            Long id,
            String nome,
            String cidade
    ) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getCidade () {
        return cidade;
    }

    public void setCidade (String Cidade) {
        this.cidade = cidade;
    }

}
