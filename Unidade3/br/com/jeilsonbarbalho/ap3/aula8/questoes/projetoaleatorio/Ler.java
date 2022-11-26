package br.com.jeilsonbarbalho.ap3.aula8.questoes.projetoaleatorio;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ler {
    public static void main(String[] args) {

        int acumulador = 0;
        int contador = 0;

        try {
            FileReader arquivo = new FileReader("numerosAleatorios.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            while (leitor.ready()) {
                String linhaLida = leitor.readLine();

                acumulador = acumulador + Integer.parseInt(linhaLida);
                contador++;
            }

            System.out.println("\nA média dos números lidos é:\n" + acumulador / contador);
            System.out.println("\nTotal de linhas lidas:\n" + contador);

            leitor.close();
            arquivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}