package br.com.jeilsonbarbalho.ap3.aula7.aulas.projetoempregado2;

import java.util.Scanner;

public class TestaEmpregado {
    public static void main(String[] args) {

        Scanner entradaPadrao = new Scanner(System.in);

        System.out.println("\nDigite o primeiro nome do novo empregado:");
        String primeiroNome = entradaPadrao.nextLine();

        System.out.println("\nDigite o sobrenome do novo empregado:");
        String sobrenome = entradaPadrao.nextLine();

        boolean salarioValido = false;
        double salarioMensal = -1;

        //Try e Catch servem para imperdir que o algoritmo pare de funcionar!
        while (!salarioValido) {
            try {
                System.out.println("\nDigite o salário (ou -1 para sair):");
                salarioMensal = entradaPadrao.nextDouble();
                salarioValido = true;
            } catch (Exception e) {
                System.err.println("\nErro ao ler o salario. Digite um valor númerico!");
                entradaPadrao.next();
            }
        }

        Empregado novoEmpregado = new Empregado(primeiroNome, sobrenome, salarioMensal);
        System.out.println(novoEmpregado);
        entradaPadrao.close();
    }
}