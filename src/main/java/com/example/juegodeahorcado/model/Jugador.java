package com.example.juegodeahorcado.model;

public class Jugador {
    private String letraClave;
    public Jugador(String letraClave){
        this.letraClave = letraClave;
    }
    public String getLetraClave() {return letraClave; }
    public void setLetraClave(String letraClave) {this.letraClave = letraClave; }
}
