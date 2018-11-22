package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<FiguraPlana> list = new ArrayList<FiguraPlana>();

        Quadrado q = new Quadrado(3,3);
        Triangulo t = new Triangulo(3 ,3,3,3,3);
        Circulo c = new Circulo(5);
        Losango d = new Losango(10,20,30,40,50,55);



        list.add(q);
        list.add(t);
        list.add(c);
        list.add(d);

        for(FiguraPlana f : list) {
            System.out.println(f.toString());
            System.out.print("Área: ");
            System.out.println(f.area());
            System.out.print("Perímetro: ");
            System.out.println(f.perimetro());
            System.out.println();
        }
    }
}
