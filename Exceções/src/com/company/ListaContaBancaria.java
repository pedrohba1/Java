package com.company;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

public class ListaContaBancaria {
    private ArrayList<ContaBancaria> ListaContas = new ArrayList<>();
    private int totalContas = 0;
    private static int limiteContas = 10;

    public void inserir(String nome, double limite) throws BufferOverflowException {

        if(totalContas == limiteContas){
            BufferOverflowException e = new BufferOverflowException();
            throw e;
        }
        ContaBancaria c = new ContaBancaria(nome, limite);
        ListaContas.add(c);
        totalContas++;
    }

    //remove pelo nome
    public void remover(String nome) throws BufferUnderflowException {
        if(totalContas == 0){
            BufferUnderflowException e1 = new BufferUnderflowException();
            throw e1;
        }


        for(ContaBancaria i : ListaContas){
            if(i.getNome() == nome){
                ListaContas.remove(i);
                totalContas--;
            }
        }
    }


    public ContaBancaria obter(String nome) throws ClassNotFoundException{
        for(ContaBancaria i : ListaContas) {
            if(i.getNome() == nome){
                return i;
            }
        }
        ClassNotFoundException e = new ClassNotFoundException();
        throw e;
    }


}
