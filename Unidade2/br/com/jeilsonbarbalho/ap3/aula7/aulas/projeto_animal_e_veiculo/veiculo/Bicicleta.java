package br.com.jeilsonbarbalho.ap3.aula7.aulas.projeto_animal_e_veiculo.veiculo;

public class Bicicleta extends Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Pedala!");
        super.acelerar();
    }
}