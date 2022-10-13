package br.com.jeilsonbarbalho.ap3.aula6.questoes.projetocarro;

import java.time.LocalDate;

public class Marca {
    
    private String nome;
    private int nrDeModelos;
    private LocalDate anoLancamento;
    private int codigoIdentificador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(LocalDate anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    @Override
    public String toString() {
        return ""                        +
        "\nNome = "                      + nome                + 
        "\nNúmero de Modelos = "         + nrDeModelos         + 
        "\nAno de Lançamento = "         + anoLancamento       + 
        "\nCódigo do Identificador = "   + codigoIdentificador + "\n";
    }
}