package br.com.jeilsonbarbalho.ap3.aula7.questoes.projetocontato3;

public class Contato {
    
    private String nome;
    private String telefone;
    private int identificador;
    private static int contador = 0;

    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.identificador = contador;
        this.nome = nome;
        this.telefone = telefone;
        Contato.contador++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Contato"   +
        "\nNome = "          + nome          + 
        "\nTelefone = "      + telefone      + 
        "\nIdentificador = " + identificador +   "\n";
    }
}