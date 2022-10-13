package br.com.jeilsonbarbalho.ap3.aula6.questoes.projetocarro;

import java.time.LocalDate;

import br.com.jeilsonbarbalho.ap3.aula6.questoes.projetocarro.endereco.Estado;
import br.com.jeilsonbarbalho.ap3.aula6.questoes.projetocarro.endereco.CEP;
import br.com.jeilsonbarbalho.ap3.aula6.questoes.projetocarro.endereco.Endereco;

public class TestaCarro {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Jeilson Barablho");
        Marca marca = new Marca();

        Endereco endereco = new Endereco(
            "Sítio Nova Esperança", 
            "Zona Rural", 
            "Assú", 
            25, 
            new CEP(59650, 000), 
            Estado.RN
        );

        Dono dono = new Dono("Jeilson Barbalho Borges Filho", endereco);

        LocalDate localDate = LocalDate.now();

        marca.setAnoLancamento(localDate);
        marca.setCodigoIdentificador(5836);
        marca.setNome("Gol Quadrado");
        marca.setNrDeModelos(18);

        carro.setMarca(marca);
        carro.setAno(localDate);
        carro.setCambio(Cambio.AUTOMATICO);
        carro.setCor("Branco");
        carro.setModelo("Esportivo");
        carro.setNumChassi("FLM38");
        carro.setNumeroPortas(2);
        carro.setQuantidadeMarchas(10);
        carro.setTetoSolar(false);
        carro.setVelocidadeAtual(0);
        carro.setVelocidadeMaxima(350);
        carro.setVolumeTanque(100);

        dono.getCarros().add(carro);

        System.out.println(dono);
        for(Carro c: dono.getCarros()){
            System.out.println(carro);
        }
    }
}