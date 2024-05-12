package br.ufg.inf.danilloparreira.hosptal.model.abstracts;

import br.ufg.inf.danilloparreira.hosptal.model.abstracts.SuperClasse;

public abstract class Medico extends SuperClasse {

    private String nome;
    private String crm;

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

}