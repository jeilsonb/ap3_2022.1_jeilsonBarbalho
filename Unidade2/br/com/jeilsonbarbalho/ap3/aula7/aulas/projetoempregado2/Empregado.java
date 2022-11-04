package br.com.jeilsonbarbalho.ap3.aula7.aulas.projetoempregado2;

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
   
    public String primeiroNome;
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

    /**
     * Retorna o salário mensal multiplicado por 12.
     * @return 
     */
    public double getSalarioAnual(){
        return this.salarioMensal*12;
    }

    @Override
    public String toString() {
        return "Empregado = "       +
                "\nPrimeiroNome = "      + primeiroNome      +
                "\nSobrenome = "         + sobrenome         +
                "\nSalário Mensal = "    + salarioMensal     +
                "\nSalário Anual = "     + getSalarioAnual() + "\n";
    }
}