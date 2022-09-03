package br.com.jeilsonbarbalho.ap3.exercicio4.aulas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contato {

    private String nomeCompleto;
    private String email;
    private String telefone;
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

    @Override
    public String toString() {


        return "Contato[" +
                "email=" + email + ", " +
                "nomeCompleto=" + nomeCompleto + ", " +
                "telefone=" + telefone + ", " +
                "dataDeNascimento=" + dataDeNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
                "]";
    }
}