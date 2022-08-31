package br.com.jeilsonbarbalho.ap3.exercicio2.questoes.questao5;

/*
Faça uma classe Caneta, que tem um modelo, uma cor, a numeração da ponta, 
o nível de tinta atual e se ela encontra-se tampada ou não. 
Escreva a classe TestaCaneta, que testa todas as funcionalidade da classe criada.
*/

public class Caneta{
    String modelo;
    String cor;
    double numero;
    double tinta;
    boolean tampa = true;

    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public double getNumero(){
        return numero;
    }
    public double getTinta(){
        return tinta;
    }
    public boolean getTampa(){
        return tampa;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setNumero(double numero){
        this.numero = numero;
    }
    public void setTinta(double tinta){
        this.tinta = tinta;
    }
    public void setTampa(boolean tampa){
        this.tampa = tampa;
    }
    
    public void tampar(){
        if(tampa){
           System.out.println("A caneta está tampada!"); 
        }else{
            tampa = true;
            System.out.println("A caneta foi tampada!");
        }
    }
    
    public void destampar(){
        if(tampa){
            tampa = false;
            System.out.println("A caneta foi destampada!");
        }else{
            System.out.println("A caneta já está destampada!");
        }
    }

    @Override
    public String toString() {
        return modelo +"\n" + cor +"\n" + numero +"\n" + tinta +"\n" + tampa;
    }
}