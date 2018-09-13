package com.company;




public class Ponto {
    private double x;
    private double y;


    public void setPonto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia(double x, double y){
        return Math.sqrt(Math.pow(this.x -x, 2) + Math.pow(this.y - y, 2));
    }

    public double distancia(Ponto p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y -  p.getY(), 2));
    }

}
