package br.com.jeilsonbarbalho.ap3.aula7.aulas.projeto_animal_e_veiculo.veiculo;

public class TestaVeiculo {
    public static void main(String[] args) {
        
        //Coisas do Veiculo
        Veiculo veiculoRapidoPC = new Veiculo();
        veiculoRapidoPC.acelerar();
        System.out.println(veiculoRapidoPC);

        //Coisas da Bicicleta
        Bicicleta b = new Bicicleta();
        b.setMarca("Caloi ");
        b.acelerar();
        System.out.println(b);

        Carro c = new Carro();
        c.setMarca("Fiat ");
        c.setModelo("Uno ");
        c.setPlaca("Sem Placa ");
        c.acelerar();
        System.out.println(c);
    }
}