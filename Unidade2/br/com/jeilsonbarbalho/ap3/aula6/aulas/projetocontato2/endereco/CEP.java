package br.com.jeilsonbarbalho.ap3.aula6.aulas.projetocontato2.endereco;

public class CEP {
    public CEP(int primeiraParte, int segundaParte) {
        this.primeiraParte = primeiraParte;
        this.segundaParte = segundaParte;
    }

    // 00000-000
    public int primeiraParte;
    public int segundaParte;

    public boolean isValido() {
        return false;
    }

    public int getPrimeiraParte() {
        return primeiraParte;
    }

    public void setPrimeiraParte(int primeiraParte) {
        this.primeiraParte = primeiraParte;
    }

    public int getSegundaParte() {
        return segundaParte;
    }

    public void setSegundaParte(int segundaParte) {
        this.segundaParte = segundaParte;
    }

    @Override
    public String toString() {
        return "CEP: " + primeiraParte + "-" + segundaParte;
    }
}