package br.com.jeilsonbarbalho.ap3.exercicio2.questoes;

/*
Escreva um programa em Java para ler o nome e a idade de uma pessoa. 
Exiba quantos dias de vida ela possui. 
Considere sempre anos completos, e que um ano possui 365 dias. 
Ex: uma pessoa com 19 anos possui 6935 dias de vida Um exemplo de saída: 
"MARIA, VOCÊ JÁ VIVEU 6935 DIAS!"
*/

import java.util.Scanner;

public class Questao2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine();
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();

        System.out.println(nome + "você já viveu: " + idade * 365);

        entrada.close();
    }
}