package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ponto p = new Ponto();
        System.out.print("digite uma coordenada");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        p.setPonto(x,y);
        System.out.print("digite outra coordenada");

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        Ponto p2 = new Ponto();

        p2.setPonto(x1,y1);
        System.out.println("a distancia entre os dois pontos é " + p.distancia(p2));
        // write your code here
        sc.close();
    }
}

