package br.com.jeilsonbarbalho.ap3.exercicio2.aulas;

//Ler um valor da entrada padrão e escrever:
//É MAIOR QUE 10! se o valor lido for maior que 10
//Caso contrário escrever não é MAIOR QUE 10.

import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); //2. instanciando e criando
        
        String nomeCompleto = entrada.nextLine();
        System.out.println("Nome digitado=" + nomeCompleto);
        System.out.println("Maiusculo=" + nomeCompleto.toUpperCase());
        System.out.println("Minusculo=" + nomeCompleto.toLowerCase());

        entrada.close();
    }
}