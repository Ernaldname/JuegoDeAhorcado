package com.example.juegodeahorcado.model;

public class Ayuda {
    private int contadorDeAyuda;

    public Ayuda() {
        updateAyuda (3); // Inicias con el máximo de ayudas
    }

    // Método para actualizar las oportunidades de ayuda basada en el contador de errores
    public void updateAyuda(int contador) {
        this.contadorDeAyuda = contador;
        // logica del codigo updateAyuda

    }

    public int getContadorDeAyuda() { return contadorDeAyuda; }

}

