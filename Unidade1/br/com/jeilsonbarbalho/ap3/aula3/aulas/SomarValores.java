package br.com.jeilsonbarbalho.ap3.aula3.aulas;

//Some 10 valores

import java.util.Scanner;

public class SomarValores {

    public static void main(String[] args){
        Scanner entradaPadrao = new Scanner(System.in);
        int valoresLidos[] = new int[10];

        //Ler os números 
        for(int i = 0; i < 10; i++){
            System.out.println("\nDigite um valor: ");
            valoresLidos[i] = entradaPadrao.nextInt();
        }

        //Escrever os números
        for (int i = 0; i < valoresLidos.length; i++){
            System.out.println("\nvaloresLidos " + i + " = " + valoresLidos[i]);
        }
        
        //Escrever a média
        int soma = 0;
        for (int i = 0; i < valoresLidos.length; i++){
            soma += valoresLidos[i];
        }

        System.out.println("\nSoma = " + soma);

        entradaPadrao.close();
    }
}