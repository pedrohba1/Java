package com.company;

public class Quadrado  extends FiguraPlana{
    private double x,y;

    public double area(){
        return x*y;
    }
    public double perimetro(){
        return 2*x + 2*y;
    }


    Quadrado(double x, double y){
        this.setX(x);
        this.setY(y);
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + "Quadrado ";
    }
}
