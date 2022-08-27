package br.com.jeilsonbarbalho.exercicio2.aulas;

//Ler um valor da entrada padrão e escrever:
//É MAIOR QUE 10! se o valor lido for maior que 10
//Caso contrário escrever NÃO É MAIOR QUE 10.

import java.util.Scanner;

public class Aula1 {

    public static void main(String[] args){
        Scanner entradaPadrao = new Scanner(System.in);
        int valorLido;

        System.out.printf("Digite um valor:");
        valorLido = entradaPadrao.nextInt();

        if (valorLido >= 10)
            System.out.printf("É maior ou igual a 10!");
        else
            System.out.printf("Não é maior que 10!");

        entradaPadrao.close();
    }
}