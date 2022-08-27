package br.com.jeilsonbarbalho.projetoempregado;

/*
 * A fim de representar empregados em uma firma,
 * crie uma classe chamada Empregado que inclui as
 * três informações a seguir como atributos:
um primeiro nome
um sobrenome
um salário mensal
Sua classe deve ter um construtor que inicializa os três atributos.
Forneça um método set e get para cada atributo. Se o salário mensal não for positivo, configure-o como 0.0.
Escreva uma classe Principal que demonstra as capacidades da classe.
Crie duas instâncias da classe e exiba o salário anual de cada instância.
 */

public class Empregado {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal < 0.0)
            this.salarioMensal = 0.0;
        else
            this.salarioMensal = salarioMensal;
    }

    public double getSalarioAnual(){
        return this.salarioMensal*12;
    }

    @Override
    public String toString() {
        return "Empregado = ["      +
                "primeiroNome = "     + primeiroNome      + ", " +
                "sobrenome = "        + sobrenome         + ", " +
                "salarioMensal = "    + salarioMensal     + ", " +
                "salarioAnual = "     + getSalarioAnual() + "]";
    }

}