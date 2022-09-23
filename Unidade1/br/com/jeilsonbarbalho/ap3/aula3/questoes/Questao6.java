package br.com.jeilsonbarbalho.ap3.aula3.questoes;

/*
Faça uma classe em Java com um método main() que leia da entrada padrão a velocidade máxima 
permitida em uma avenida e leia a velocidade com que o motorista estava dirigindo nela. 
Calcule e mostre a multa que uma pessoa vai receber, sabendo os valores:
 
1- Multa de R$ 50 reais se o motorista ultrapassar em até 10km/h a velocidade permitida
2- Multa de R$ 100 reais se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida
3- Multa de R$ 200 reais se estiver igual e acima de 31km/h da velocidade permitida
*/

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner velocidade = new Scanner(System.in);
        int velocidadeMaxima = 60;
        int velocidade1 = 0;

        System.out.println("Digite a velocidade do veiculo:");
        velocidade1 = velocidade.nextInt();

        int velocidade2 = velocidade1 - velocidadeMaxima;

        if(velocidade2 > 0 && velocidade2 <= 10){
            System.out.println("A multa custa R$ 50,00");

        }else if(velocidade2 >= 11 && velocidade2 <= 30){
            System.out.println("A multa custa R$ 100,00");

        }else if(velocidade2 > 30){
            System.out.println("A multa custa R$ 200,00");

        }else{
            System.out.println("Não é preciso pagar multa");
        }
        
        velocidade.close();
    }
}