package br.com.jeilsonbarbalho.ap3.aula7.aulas.projeto_animal_e_veiculo.animal;

//Piscou, perdeu!
public class Cachorro extends Animal {
   
    private String raca;
    private String porte;
    
    public Cachorro() {
        super(5.6, "Mamiferos");
        System.out.println("Construtor de Cachorro");
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