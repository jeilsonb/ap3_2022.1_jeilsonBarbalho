package br.com.jeilsonbarbalho.ap3.aula3.questoes;

//Escreva um programa em Java que lê um vetor os valores(30) de inteiros. 
//Substitua, a seguir, todos os valores iguais a 7 por -7. Escreva o vetor resultante.

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int valores[] = new int[30];

        for(int i = 0; i < valores.length; i++){
             System.out.println("Insira um valor:");
             valores[i] = entrada.nextInt();
        }

        for(int i = 0; i < valores.length; i++){
            if(valores[i] == 7){
                valores[i] = -7;
            }
        }

        for(int i = 0; i < valores.length; i++){
            System.out.println("Resultado: " + valores[i]);
        }
        
        entrada.close();
    }
}