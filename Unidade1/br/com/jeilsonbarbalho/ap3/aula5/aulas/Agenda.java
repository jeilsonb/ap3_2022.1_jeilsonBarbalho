package br.com.jeilsonbarbalho.ap3.aula5.aulas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public static void main(String[] args) {
        
        List<Contato> osContatos = new ArrayList<Contato>();

        for (int i = 0; i < 50; i++) {
            Contato novoContato = new Contato();
            novoContato.setNomeCompleto("Contato" + i);
            novoContato.setTelefone("Telefone" + i);
            novoContato.setEmail("email@contato" + i + ".com.br");
            
            LocalDate dataDeNascimento =
            LocalDate.parse("01/09/1999",
            DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            novoContato.setDataDeNascimento(dataDeNascimento);
            osContatos.add(novoContato);
        }

        for (int i = 0; i < osContatos.size(); i++)
            System.out.println(osContatos.get(i));
    }
}