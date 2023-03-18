package br.com.jeilsonbarbalho.ap3.aula3.aulas;

//Ler um valor da entrada padrão e escrever:
//É MAIOR QUE 10! se o valor lido for maior que 10
//Caso contrário escrever não é MAIOR QUE 10.

import java.util.Scanner;

public class CompararValores {

    public static void main(String[] args){
        Scanner entradaPadrao = new Scanner(System.in);
        int valorLido;

        System.out.printf("\nDigite um valor: ");
        valorLido = entradaPadrao.nextInt();

        if (valorLido >= 10)
            System.out.printf("\nÉ maior ou igual a 10!");
        else
            System.out.printf("\nNão é maior que 10!");

        entradaPadrao.close();
    }
}