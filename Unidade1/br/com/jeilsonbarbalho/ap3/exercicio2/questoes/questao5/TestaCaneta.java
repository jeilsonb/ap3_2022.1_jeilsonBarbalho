package br.com.jeilsonbarbalho.ap3.exercicio2.questoes.questao5;

/*
Faça uma classe Caneta, que tem um modelo, uma cor, a numeração da ponta, 
o nível de tinta atual e se ela encontra-se tampada ou não. 
Escreva a classe TestaCaneta, que testa todas as funcionalidade da classe criada.
*/

public class TestaCaneta{
    public static void main(String[] args){
        Caneta canetaAzul = new Caneta();

        canetaAzul.setModelo("Piloto");
        canetaAzul.setCor("Vermelha");
        canetaAzul.setNumero(1358);
        canetaAzul.setTinta(10);
        canetaAzul.setTampa(true);

        System.out.println(canetaAzul + "\n");

        canetaAzul.destampar();
        System.out.println(canetaAzul + "\n");

        canetaAzul.tampar();
        System.out.println(canetaAzul + "\n");
    }
}