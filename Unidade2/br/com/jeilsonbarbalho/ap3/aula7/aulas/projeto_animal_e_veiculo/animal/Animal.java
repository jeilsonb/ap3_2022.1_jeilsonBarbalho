package br.com.jeilsonbarbalho.ap3.aula7.aulas.projeto_animal_e_veiculo.animal;

//Piscou, perdeu!
public class Animal {
    
    private double peso = -1;
    private String grupo = "GrupoPadrao";

    public Animal(double peso, String grupo) {
        this.peso = peso;
        this.grupo = grupo;
        System.out.println("Construtor de Animal com parametro");
    }

    public Animal() {
        super();
        System.out.println("Construtor padrao Animal");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}