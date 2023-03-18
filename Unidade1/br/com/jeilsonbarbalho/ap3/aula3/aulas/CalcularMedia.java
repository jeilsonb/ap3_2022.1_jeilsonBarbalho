package br.com.jeilsonbarbalho.ap3.aula3.aulas;

//Informe dois valores e calcule a média deles:

import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        Scanner entradaPadrao = new Scanner(System.in);
        int valoresLidos[] = new int[2];

        // Ler os números
        for (int i = 0; i < valoresLidos.length; i++) {
            System.out.println("\nDigite um valor: ");
            valoresLidos[i] = entradaPadrao.nextInt();
        }

        // Escrever os números
        for (int i = 0; i < valoresLidos.length; i++) {
            System.out.println("\nvaloresLidos" + i + " = " + valoresLidos[i]);
        }
        
        // Escrever a média
        int media = 0;
        for (int i = 0; i < valoresLidos.length; i++) {
            media += valoresLidos[i];
        }

        System.out.println("\nMédia = " + media / valoresLidos.length);

        entradaPadrao.close();
    }
}