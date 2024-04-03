package com.example.juegodeahorcado.model;

public class Jugador {

    private char letraClave;

    public Jugador(char letraClave){
        this.letraClave = letraClave;
    }

    public char getLetraClave() {return letraClave; }

    public void setLetraClave(char letraClave) {this.letraClave = letraClave; }
}
