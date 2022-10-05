package br.com.jeilsonbarbalho.ap3.aula4.aulas.projetoempregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestaEmpregado2 {

    public static Empregado leEmpregado() {
        Scanner entradaPadrao = new Scanner(System.in);

        System.out.println("Digite o primeiro nome do novo empregado:");
        String primeiroNome = entradaPadrao.nextLine();

        System.out.println("Digite o sobrenome do novo empregado:");
        String sobrenome = entradaPadrao.nextLine();

        System.out.println("Digite o sobrenome do novo empregado:");
        double salarioMensal = entradaPadrao.nextDouble();

        Empregado novoEmpregado = new Empregado(primeiroNome, sobrenome, salarioMensal);
        entradaPadrao.close();
        return novoEmpregado;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Aqui testaremos os empregados!");

        Random gerador = new Random();

        List<Empregado> osEmpregados = new ArrayList<Empregado>();

        Scanner entradaPadrao = new Scanner(System.in);

        int vemDoUsuario = entradaPadrao.nextInt();

        for (int i = 0; i < vemDoUsuario; i++) {
            String primeiroNome = "Empregado" + i;
            String sobrenome = "Sobrenome" + i;
            double salarioMensal = gerador.nextInt(1000);
            Empregado novo = new Empregado(primeiroNome, sobrenome, salarioMensal);
            osEmpregados.add(novo);
        }

        for (int i = 0; i < osEmpregados.size(); i++) {
            System.out.println(osEmpregados.get(i));
        }
        System.out.println("Acabei!");

        entradaPadrao.close();
    }
}