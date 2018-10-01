package com.company;

public class Cliente{
//Autor: Pedro Henrique Bufulin
    private static int cont = 0;
    private int id;
    private String nome;

    // coloquei o nome como parâmentro do construtor para agilizar
    public Cliente(String nome){
        this.id = cont++;
        this.nome = nome;
    }


    public  int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimeCliente(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("ID: "+ this.getId());
    }


}

