package br.com.ap3.jeilsonbarbalho;
public class Pessoa{
    String nome;
    int idade;

    String getNome(){
        return nome;
    }
    int getIdade(){
        return idade;
    }
    void setNome(String novoNome){
        nome=novoNome;
    }
    void setIdade(int novaIdade){
        idade=novaIdade;
    }
}