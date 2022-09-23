package br.com.jeilsonbarbalho.ap3.aula6.aulas.projetocontato2.endereco;

public class Endereco {

    private String rua;
    private String bairro;
    private String cidade;
    private int numero;
    private CEP cep;
    private Estado estado;

    public Endereco() {
    }

    public Endereco(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public CEP getCep() {
        return cep;
    }

    public void setCep(CEP cep) {
        this.cep = cep;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "Nova Esperança"    +
        "\nBairro: "                + bairro      +
        "\n"                        + cep         +
        "\nCidade: "                + cidade      +
        "\nEstado: "                + estado      + 
        "\nNúmero: "                + numero      + "\n";
    }
}