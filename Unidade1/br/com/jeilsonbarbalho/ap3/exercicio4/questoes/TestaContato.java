package br.com.jeilsonbarbalho.ap3.exercicio4.questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestaContato {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String nome;
        String email;
        String telefone;
        String dataDeNascimento;

        List<Contato> osContatos = new ArrayList<>();

        while (osContatos.size() < 5) {
            System.out.println("\nDigite o nome do novo contato: ");
            nome = entrada.nextLine();

            System.out.println("\nDigite o email do novo contato: ");
            email = entrada.nextLine();

            System.out.println("\nDigite o telefone do novo contato: ");
            telefone = entrada.nextLine();

            System.out.println("\nDigite a data de nascimento do novo contato neste formato (02/09/2022): ");
            dataDeNascimento = entrada.next();

            Contato contato = new Contato(nome, email, telefone,
                    LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            osContatos.add(contato);
        }

        osContatos.forEach(System.out::println);
        /*
        for (Contato contato : osContatos) {
            System.out.println(contato);
        }
        */
        entrada.close();
    }
}