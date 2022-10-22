package br.com.jeilsonbarbalho.ap3.aula7.aulas.projeto_animal_e_veiculo.veiculo;

public class Veiculo {
   
    private String marca = "Marca Padrão";
    private String modelo = "Modelo Padrão";

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo() {
        this.marca = "Marca Padrão";
        this.modelo = "Modelo Padrão";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("\nAcelerando o Veículo");
    }

    @Override
    public String toString() {
        return "Veículo"         +
        "Marca = "      + marca  + 
        "Modelo = "     + modelo + "\n";
    }
}