package br.com.jeilsonbarbalho.ap3.aula8.aulas.projetoempregado3;

import java.io.BufferedReader;
import java.io.FileReader;

public class EmpregadoLeTXT {

    public static void main(String[] args) {

        try {
            FileReader arquivo = new FileReader("empregadoTexto.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            while (leitor.ready()) {
                String linhaLida = leitor.readLine();
                String[] empregadoLinha = linhaLida.split(",");
                
                String primeiroNome = empregadoLinha[0].split("=")[2];
                String sobrenome = empregadoLinha[1].split("=")[1];
                
                String salarioString = empregadoLinha[2].split("=")[1];
                double salarioMensal = Double.parseDouble(salarioString);

                
                Empregado novoEmpregado = new Empregado(primeiroNome, sobrenome, salarioMensal);
                System.out.println("Lido="+primeiroNome);
                
            }

            leitor.close();
            arquivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println(novoEmpregado);

    }
}