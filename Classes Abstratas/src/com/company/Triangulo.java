package com.company;

public class Triangulo extends  FiguraPlana{
    private double base,h;
    private double a,b,c;

    public double area(){
        return (base*h)/2;
    }
    public double perimetro(){
        return a+b+c;
    }

    Triangulo(double a, double b, double c, double base, double h){
        this.setA(a);
        this.setB(b);
        this.setC(c);
        this.setBase(base);
        this.setH(h);

    }

    @Override
    public String toString() {
        return super.toString() + "Triangulo";
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setH(double h) {
        this.h = h;
    }
}
