package br.com.jeilsonbarbalho.ap3.exercicio2.questoes;

/*
Sabendo que latão é constituÃ­do de 70% de cobre e 30% de zinco, 
faça um programa em Java que indique a quantidade de cada um desses componentes 
para se obter uma certa quantidade de latão (a quantidade deve ser requerida do usúario).
*/

import java.util.Scanner;

public class Questao1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Double valorLido;

        System.out.println("Digite a quantidade de latÃ¢o desejada em KG:");
        valorLido = entrada.nextDouble();

        System.out.println("Quantidade de Zinco KG: " + valorLido * 0.3);
        System.out.println("Quantidade de Cobre KG: " + valorLido * 0.7);
        
        entrada.close();
    }
}