package br.com.jeilsonbarbalho.ap3.aula8.aulas.projetoempregado3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestaEmpregado {

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

        entradaPadrao.close();
    }

    public void salvaEmpregado(Empregado empregado) {
        FileOutputStream fileOS = null;
        ObjectOutputStream objectOS = null;

        try {
            fileOS = new FileOutputStream("H:\\Meu Drive\\UFERSA\\saida.empregado", true);
            objectOS = new ObjectOutputStream(fileOS);
            objectOS.writeObject(empregado);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileOS.close();
                objectOS.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}