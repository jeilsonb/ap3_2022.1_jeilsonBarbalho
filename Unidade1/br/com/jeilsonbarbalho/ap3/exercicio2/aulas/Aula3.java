package br.com.jeilsonbarbalho.ap3.exercicio2.aulas;

//Ler um valor da entrada padrÃ£o e escrever:
//É MAIOR QUE 10! se o valor lido for maior que 10
//Caso contrÃ¡rio escrever NÃƒO Ã‰ MAIOR QUE 10.

import java.util.Scanner;

public class Aula3 {

    public static void main(String[] args){
        Scanner entradaPadrao = new Scanner(System.in);
        int valoresLidos[] = new int[10];

        //Ler os números 
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor:");
            valoresLidos[i] = entradaPadrao.nextInt();
        }

        //Escrever os números
        for (int i = 0; i < valoresLidos.length; i++){
            System.out.println("valoresLidos[" + i + "]" + valoresLidos[i]);
        }
        
        //Escrever a média
        int soma = 0;
        for (int i = 0; i < valoresLidos.length; i++){
            soma += valoresLidos[i];
        }

        System.out.println("Soma=" + soma);

        entradaPadrao.close();
    }
}