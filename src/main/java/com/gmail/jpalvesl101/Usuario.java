package com.gmail.jpalvesl101;


public class Usuario {
    private String nome;
    private String data_nasc;
    private Boolean grupo_de_risco;

    public Usuario(String nome, String data_nasc, Boolean grupo_de_risco) {
        setNome(nome);
        setData_nasc(data_nasc);
        setGrupo_de_risco(grupo_de_risco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Boolean getGrupo_de_risco() {
        return grupo_de_risco;
    }

    public void setGrupo_de_risco(Boolean grupo_de_risco) {
        this.grupo_de_risco = grupo_de_risco;
    }
}
