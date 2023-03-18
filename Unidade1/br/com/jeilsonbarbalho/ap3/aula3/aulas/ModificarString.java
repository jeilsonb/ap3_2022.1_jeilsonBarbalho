package br.com.jeilsonbarbalho.ap3.aula3.aulas;

//Receber valores do tipo String e modificá-los:

import java.util.Scanner;

public class ModificarString {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); //2. instanciando e criando
        
        String nomeCompleto = entrada.nextLine();
        System.out.println("\nNome digitado = " + nomeCompleto);
        System.out.println("Maiusculo = " + nomeCompleto.toUpperCase());
        System.out.println("Minusculo = " + nomeCompleto.toLowerCase());

        entrada.close();
    }
}