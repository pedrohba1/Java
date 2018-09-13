package com.company;

public class Circulo {
    Ponto centro = new Ponto();
    private double raio;
    private String nome;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void getCentro(Ponto p){
        this.centro = p;
    }


    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }


    public double diametro(){
        return 2*(this.raio);
    }

    public double circunferencia(){
        return 2*(Math.PI* this.raio);
    }

    public double area(){
        return  Math.PI * Math.pow(this.raio,2);
    }

}
