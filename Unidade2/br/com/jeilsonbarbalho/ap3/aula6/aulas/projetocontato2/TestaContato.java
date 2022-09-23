package br.com.jeilsonbarbalho.ap3.aula6.aulas.projetocontato2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.jeilsonbarbalho.ap3.aula6.aulas.projetocontato2.endereco.CEP;
import br.com.jeilsonbarbalho.ap3.aula6.aulas.projetocontato2.endereco.Endereco;
import br.com.jeilsonbarbalho.ap3.aula6.aulas.projetocontato2.endereco.Estado;

public class TestaContato {
    public static void main(String[] args) {
        Contato contatoJeilson = new Contato();

        Endereco enderecoDeJeilson = new Endereco("Nova Esperança");
        enderecoDeJeilson.setBairro("Zona Rural");
        enderecoDeJeilson.setCidade("Assú");
        enderecoDeJeilson.setEstado(Estado.RN);
        enderecoDeJeilson.setNumero(268);
        enderecoDeJeilson.setCep(new CEP(59650, 000));
        
        LocalDate dataDeNascimento =
        LocalDate.parse("13/08/2002",
        DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        contatoJeilson.setEmail("jeilsong850@gmail.com");
        contatoJeilson.setTelefone("(84) 99989-1334");
        
        contatoJeilson.setDataDeNascimento(dataDeNascimento);
        
        contatoJeilson.setEndereco(enderecoDeJeilson);
        contatoJeilson.setNomeCompleto("Jeilson Barbalho Borges Filho");

        System.out.println(contatoJeilson);
    }
}