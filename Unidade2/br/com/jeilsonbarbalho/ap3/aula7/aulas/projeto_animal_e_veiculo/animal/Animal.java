package br.com.jeilsonbarbalho.ap3.aula7.aulas.projeto_animal_e_veiculo.animal;

//Piscou, perdeu!
public class Animal {
    
    private double peso = -1;
    private String grupo = "Grupo Padrão";

    public Animal(double peso, String grupo) {
        this.peso = peso;
        this.grupo = grupo;
    }

    public Animal() {
        super();
        System.out.println("\nConstrutor padrão do Animal");
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

    @Override
    public String toString() {
        return
        "Peso = "    + peso  +
        "\nGrupo = "   + grupo + "\n";
    }
}