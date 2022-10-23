package br.com.jeilsonbarbalho.ap3.aula7.aulas.projeto_animal_e_veiculo.animal;

public class Gato extends Animal {
    
    private String raca;
    private String porte;
    
    public Gato() {
        super(10.5, "Mamiferos");
        System.out.println("\nConstrutor de Gato");
    }
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}