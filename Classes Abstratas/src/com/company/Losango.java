package com.company;

public class Losango extends FiguraPlana {
    private double D,d,l1,l2,l3,l4;


    public double area(){
        return (D*d)/2;
    }
    public double perimetro(){
        return l1+l2+l3+l4;
    }

    Losango(double D, double d, double l1, double l2, double l3, double l4){
        this.setD(d);
        this.setDzao(D);
        this.setL1(l1);
        this.setL2(l2);
        this.setL3(l3);
        this.setL4(l4);
    }


    @Override
    public String toString() {
        return super.toString() + "Losango";
    }

    public void setDzao(double d) {
        this.D = d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public void setL4(double l4) {
        this.l4 = l4;
    }
}
