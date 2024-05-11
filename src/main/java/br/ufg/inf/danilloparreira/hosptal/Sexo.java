package br.ufg.inf.danilloparreira.hosptal;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String descricao;

    private Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
