package br.com.jeilsonbarbalho.ap3.aula8.aulas.projetoempregado3;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EmpregadoEscreveTXT {

    public static void main(String[] args) {

        Scanner entradaPadrao = new Scanner(System.in);

        System.out.println("Digite o primeiro nome do novo empregado:");
        String primeiroNome = entradaPadrao.nextLine();

        System.out.println("Digite o sobrenome do novo empregado:");
        String sobrenome = entradaPadrao.nextLine();

        boolean salarioValido = false;
        double salarioMensal = -1;

        while (!salarioValido) {
            try {
                System.out.println("Digite o salário (ou -1 para sair):");
                salarioMensal = entradaPadrao.nextDouble();
                salarioValido = true;
            } catch (Exception e) {
                System.err.println("Erro ao ler o salario. Digite um valor numérico!");
                entradaPadrao.next();
            }
        }

        Empregado novoEmpregado = new Empregado(primeiroNome, sobrenome, salarioMensal);
        System.out.println(novoEmpregado);

        FileWriter arquivo = null;
        PrintWriter impressora = null;

        try {
            arquivo = new FileWriter("saidaempregado.txt", true);
            impressora = new PrintWriter(arquivo);
            impressora.println(novoEmpregado);
            impressora.flush();
            impressora.close();
            arquivo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        entradaPadrao.close();
    }
}