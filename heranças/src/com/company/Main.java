package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Vendedores[] vend = new Vendedores[5];
        Administrativos[] admin = new Administrativos[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("digite o salário do vendedor " + i);
            Scanner sc = new Scanner(System.in);
            vend[i] = new Vendedores();
            vend[i].setSalarioBase(sc.nextFloat());


            //estou gerando um valor aleatório para agilizar o processo
            //e  não ter que escrever as vendas uma por uma

            float min = 300;
            float max = 1000;
            Random r = new Random();
            float random = min + r.nextFloat() * (max - min);

            vend[i].acumulaVendas(random);


            System.out.println("digite o salário do administrativo" + i);
            Scanner sc2 = new Scanner(System.in);
            admin[i] = new Administrativos();
            admin[i].setSalarioBase(sc2.nextFloat());
            int minint = 1;
            int maxint = 6;
            Random r2 = new Random();
            int random2 = r2.nextInt(6) +1;

            admin[i].acumulaHextras(random2);
        }

        //printar o total de cada funcionario.


        System.out.println("Salários finais");
        for (int i = 0; i < 5; i++) {

            vend[i].finalizaTotal();


        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            admin[i].finalizaTotal();
        }


    }
}
