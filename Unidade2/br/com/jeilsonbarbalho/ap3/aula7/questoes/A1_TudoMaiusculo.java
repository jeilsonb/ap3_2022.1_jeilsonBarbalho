package br.com.jeilsonbarbalho.ap3.aula7.questoes;

import java.util.Scanner;

public class A1_TudoMaiusculo {
  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);

    String frase = null;
    String novaFrase = null;

    try {
        novaFrase = frase.toUpperCase();

        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);  

    } catch (Exception e) {
        System.out.println("A frase inicial está nula. Foi atribuito o valor FraseVazia.");
    }
  }
}