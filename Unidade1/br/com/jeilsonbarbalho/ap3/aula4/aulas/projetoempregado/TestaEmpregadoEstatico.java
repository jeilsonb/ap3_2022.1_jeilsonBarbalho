package br.com.jeilsonbarbalho.ap3.aula4.aulas.projetoempregado;

import java.util.Scanner;

public class TestaEmpregadoEstatico {

    public static Empregado leEmpregado() {
        Scanner entradaPadrao = new Scanner(System.in);

        System.out.println("Digite o primeiro nome do novo empregado:");
        String primeiroNome = entradaPadrao.nextLine();

        System.out.println("Digite o sobrenome do novo empregado:");
        String sobrenome = entradaPadrao.nextLine();

        System.out.println("Digite o salário mensal do novo empregado:");
        double salarioMensal = entradaPadrao.nextDouble();

        Empregado novoEmpregado = new Empregado(primeiroNome, sobrenome, salarioMensal);
        entradaPadrao.close();
        return novoEmpregado;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Aqui testaremos os empregados!");

        Empregado xico = new Empregado("Xico", "Arruda", 50.0);
        Empregado jeilson = new Empregado("Jeilson", "Barbalho", 100.0);

        System.out.println(xico);
        System.out.println(jeilson);

        jeilson.setSalarioMensal(11000.0);
        System.out.println(jeilson);

        System.out.println("Salário anual de Jeilson: ");
        System.out.println(jeilson.getSalarioAnual());

        Empregado novoEmpregado = leEmpregado();
        System.out.println("O novo empregado é: ");
        System.out.println(novoEmpregado);
    }
}