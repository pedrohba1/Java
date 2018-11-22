package com.company;

import org.w3c.dom.css.CSSImportRule;

public class Circulo extends  FiguraPlana{
    private double r;
    public double area(){
        return 3.14*r*r;
    }
    public double perimetro(){
        return 2*3.14*r;
    }


    Circulo(double r){
        this.setR(r);
    }


    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo";
    }
}

