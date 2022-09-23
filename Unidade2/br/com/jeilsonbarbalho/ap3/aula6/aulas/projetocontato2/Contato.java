package br.com.jeilsonbarbalho.ap3.aula6.aulas.projetocontato2;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.jeilsonbarbalho.ap3.aula6.aulas.projetocontato2.endereco.Endereco;

public class Contato implements Pessoa, Serializable {

    private String nomeCompleto;
    private String email;
    private String telefone;
    private Endereco endereco;
    private LocalDate dataDeNascimento;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return
        "\nContato \nData de Nascimento: " +
        dataDeNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
        "\nEmail: "              + email        + 
        "\nEndereço: "           + endereco     + 
        "\nNome Completo: "      + nomeCompleto +
        "\nTelefone: "           + telefone     + "\n";
    }
}