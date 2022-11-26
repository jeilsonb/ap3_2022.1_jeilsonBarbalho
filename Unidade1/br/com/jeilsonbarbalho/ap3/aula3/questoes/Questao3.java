package br.com.jeilsonbarbalho.ap3.aula3.questoes;

//Faça um programa em Java que leia da entrada padrão a idade de 4096 pessoas 
//e exiba quantas pessoas são maiores de idade.

import java.util.Scanner;

public class Questao3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade;

        int cont = 0;
        for(int i = 0; i < 4096; i++){
            System.out.println("Digite sua idade:");
            idade = entrada.nextInt();
        
            if(idade >= 18){
                cont = cont + 1;
            }
        }  
        
        System.out.println("A quantidade de pessoas maiores de 18 é " + cont);
        
        entrada.close();
    }
}