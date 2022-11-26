package br.com.jeilsonbarbalho.ap3.aula8.questoes.projetoaleatorio;

//Faça um programa em Java que escreva 200 numeros aleatórios no arquivo numerosAleatorios.txt
//Faça um programa em Java que leia os 200 números do arquivo numerosAleatorios.txt e exiba a média dos números.

import java.util.Random;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Escreve {
    public static void main(String[] args) {

        Random numero = new Random();

        try {
            FileWriter arquivo = new FileWriter("numerosAleatorios.txt", true);
            PrintWriter impressora = new PrintWriter(arquivo);
            
            for (int i = 0; i < 200; i++) {
                impressora.println(numero.nextInt(1000));
                impressora.flush();
            }
            impressora.close();

        } catch(Exception e ) {
            e.printStackTrace();
        }
    }
}