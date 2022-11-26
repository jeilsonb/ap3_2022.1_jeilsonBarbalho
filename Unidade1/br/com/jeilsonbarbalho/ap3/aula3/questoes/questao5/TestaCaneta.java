package br.com.jeilsonbarbalho.ap3.aula3.questoes.questao5;

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