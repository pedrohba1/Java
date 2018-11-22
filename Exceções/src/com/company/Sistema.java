package com.company;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Objects;
import java.util.Scanner;

public class Sistema {
    public static void main(String args[]) {

        ListaContaBancaria list = new ListaContaBancaria();



        int option = 0;
        do {

            System.out.println("que operação deseja realizar?");
            System.out.println("1- depositar");
            System.out.println("2- sacar");
            System.out.println("3- ver saldo");
            System.out.println("4- sair");
            System.out.println("5- adicionar nova conta");
            System.out.println("6- remover conta");
            System.out.println("7- consultar dados da conta");

            Scanner option1 = new Scanner(System.in);
            option = option1.nextInt();
            Scanner valor = new Scanner(System.in);

            switch (option) {
                case 1:

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente");
                    String nome = sc.next();
                    ContaBancaria c = new ContaBancaria();
                    try {


                        c = list.Obter(c);
                    } catch (ClassNotFoundException e){
                        System.out.println("erro do tipo" + e.toString());
                    }


                    System.out.println("digite o valor que você quer depositar: ");
                    try {
                        c.depositar(valor.nextDouble());
                    }
                    catch (EstouroDeLimiteException e){
                        System.out.println("ocorreu erro do tipo" + e.toString());
                    }
                    catch (IllegalArgumentException e){
                        System.out.println("exceção do tipo " + e.toString());
                    }
                    valor.reset();
                    sc.reset();
                    break;




                case 2:

                     sc = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente");
                     nome = sc.next();
                     c = new ContaBancaria();
                    try {
                        c = list.Obter(c);
                    } catch (ClassNotFoundException e){
                        System.out.println("erro do tipo" + e.toString());
                    }


                    System.out.println("digite o valor que você quer sacar: ");
                    try{
                        c.sacar(valor.nextDouble());
                    }
                    catch (EstouroDeLimiteException e){
                        System.out.println("occoreu exceção do tipo" +  e.toString());
                     }
                    catch (IllegalArgumentException e){
                        System.out.println("exceção do tipo " + e.toString());
                    }
                    valor.reset();
                    sc.reset();
                    break;

                case 3:
                    sc = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente");
                    nome = sc.next();
                    c = new ContaBancaria();
                    try {
                        c = list.Obter(c);
                    } catch (ClassNotFoundException e){
                        System.out.println("erro do tipo" + e.toString());
                    }

                    System.out.println("seu saldo é " + c.getSaldo());
                    sc.reset();

                    break;

                case 5:

                     sc = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente");
                     nome = sc.next();

                    System.out.println("Digite o limite da conta");
                    Scanner sc2 = new Scanner(System.in);
                    double limite = sc2.nextDouble();

                    c = new ContaBancaria(nome, limite);

                    try {
                        list.inserir(c);

                    } catch  (BufferOverflowException e){
                        System.out.println("erro do tipo " + e.toString());
                    }
                    sc.reset();
                    sc2.reset();
                    break;


                case 6:
                    sc = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente");
                    nome = sc.next();
                    c = new ContaBancaria();
                    try {
                        c = list.Obter(c);
                    } catch (ClassNotFoundException e){
                        System.out.println("erro do tipo" + e.toString());
                    }

                    try{
                        list.remover(c.getNome());
                    }catch (BufferUnderflowException e){
                        System.out.println("erro do tipo " + e.toString());
                    }
                    sc.reset();
                    break;

                case 7:
                    sc = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente");
                    nome = sc.next();
                    c = new ContaBancaria();
                    try {
                        c = list.Obter(nome);
                        System.out.println("nome do cliente:" +c.getNome());
                        System.out.println("limite do cliente: "+ c.getLimite());
                        System.out.println("saldo do cliente: "+ c.getSaldo());
                    } catch (ClassNotFoundException e){
                        System.out.println("erro do tipo" + e.toString());
                    }
                    sc.reset();
                    break;
            }

        } while (option != 4);
    }
}
