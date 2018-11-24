package com.soa.ws.RestWs;

public class Tupla{

    private final long contador;
    private final int numero;


    public Tupla(long contador, int numero) {
        this.contador = contador;
        this.numero = numero;
    }

    public long getContador() {
        return contador;
    }

    public int getNumero() {
        return numero;
    }
}