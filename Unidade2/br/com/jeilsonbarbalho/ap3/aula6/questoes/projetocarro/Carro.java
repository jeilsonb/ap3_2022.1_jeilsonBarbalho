package br.com.jeilsonbarbalho.ap3.aula6.questoes.projetocarro;

/*
Um carro tem modelo, cor, ano, marca, numChassi, nome do proprietário, velocidade máxima, velocidade atual, 
número de portas, pode ou não ter teto solar, quantidade de marchas, tipo de câmbio 
(automático ou manual) e volume de combustível que cabe no tanque.
Faça o encapsulamento da classe Carro.java com os atributos mencionados anteriormente.
Implemente o método acelera que aumenta a velocidade de 1 em 1 km/h
Implemente o método freia que para o carro – Velocidade = 0 km/h
Implemete o método troca marcha
Implemente o método reduz a marcha
Todo veículo tem um proprietário obrigatoriamente (implemente um construtor de veículo passando 
o proprietário como parâmetro)
A marcha ré nao pode ser engatada se o a velocidade for superior a 0 km/h;
Transforme o atributo Marca de um carro em uma classe Marca com nome, nrDeModelos, ano de lançamento e código identificador
Implemente um método que calcule a autonomia de viagem do veículo com base no consumo médio passado como parâmetro
Implemente um método para exibir o volume de combustível
Instancie um objeto da classe Carro, Pessoa, Endereço, 
Marca e relacione os objetos utilizando os métodos ou construtores quando necessário. 
Pode usar as classes Pessoa e Endereço feitas em sala de aula.
*/

import java.time.LocalDate;

public class Carro {
    
    private String modelo;
    private String cor;
    private LocalDate ano;
    private Marca marca;
    private String numChassi;
    private String proprietario;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int numeroPortas;
    private boolean tetoSolar;
    private int quantidadeMarchas;
    private Cambio cambio;
    private int volumeTanque;

    public Carro(String proprietario){
        this.proprietario = proprietario;
    }

    public void acelerar(){
        if(this.velocidadeAtual < this.velocidadeMaxima){
            this.velocidadeAtual++;
            System.out.println("Acelereando o carro..");
        } else {
            System.out.println("O carro já atingiu sua velocidade máxima!");
        }
    }

    public void frear(){
        if(this.velocidadeAtual > 0){
            this.velocidadeAtual = 0;
            System.out.println("Freando o carro...");
        } else {
            System.out.println("O carro já está parado!");
        }
    }

    public void trocarMarcha(int novaMarcha){
        if(novaMarcha == -1 && this.velocidadeAtual == 0){
            this.quantidadeMarchas = novaMarcha;
        } else if (novaMarcha > 0){
            this.quantidadeMarchas = novaMarcha;
        }
    }

    public void reduzirMarchar(){
        if(this.quantidadeMarchas > 0){
            this.quantidadeMarchas--;
        } else {
            System.out.println("Você já está na menor marcha possível!");
        }
    }

    public void calcularAutonomia(int litrosHora){
        System.out.println("Autonomia de " + this.volumeTanque*litrosHora*this.velocidadeMaxima + "Km com o volume de tanque atual");
    }

    public void verificarTamque(){
        System.out.println("Volume do tanque " + this.volumeTanque + " Litros");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public int getQuantidadeMarchas() {
        return quantidadeMarchas;
    }

    public void setQuantidadeMarchas(int quantidadeMarchas) {
        this.quantidadeMarchas = quantidadeMarchas;
    }

    public Cambio getCambio() {
        return cambio;
    }

    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }

    public int getVolumeTanque() {
        return volumeTanque;
    }

    public void setVolumeTanque(int volumeTanque) {
        this.volumeTanque = volumeTanque;
    }

    @Override
    public String toString() {
        return "Carro"               + 
        "\nModelo = "                + modelo             + 
        "\nCor = "                   + cor                + 
        "\nAno = "                   + ano                + 
        "\nMarca = "                 + marca              + 
        "\nNúmero do Chassi = "      + numChassi          + 
        "\nProprietário = "          + proprietario       + 
        "\nVelocidade Máxima = "     + velocidadeMaxima   + 
        "\nVelocidade Atual = "      + velocidadeAtual    + 
        "\nNúmero de Portas = "      + numeroPortas       + 
        "\nTeto Solar = "            + tetoSolar          + 
        "\nQuantidade de Marchas = " + quantidadeMarchas  + 
        "\nCâmbio = "                + cambio             + 
        "\nVolume do Tanque = "      + volumeTanque       + "\n";
    }
}