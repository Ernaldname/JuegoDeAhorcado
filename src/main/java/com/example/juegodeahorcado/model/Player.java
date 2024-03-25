package com.example.juegodeahorcado.model;

public class Player {

    private int id;

    private String palabraClave;

    public Player(int id, String palabraClave){
        this.id = id;
        this.palabraClave = palabraClave;
    }

    public int getId() {return id; }
    public void setId(int id) { this.id = id;}

    public String getPalabraClave() {return palabraClave; }
    public void setPalabraClave(String palabraClave) {this.palabraClave = palabraClave; }


}
