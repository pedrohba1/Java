package com.company;

public class Vendedores extends Funcionarios {
    private float totalVendas = 0;

    public void acumulaVendas(float vendas){
        this.totalVendas += vendas;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public float salarioTotal(){
        float total;
        total = (5*(this.totalVendas)/100) + this.salarioBase;

        this.totalVendas = 0;
        return total;
    }


    public void finalizaTotal(){
        System.out.println("valor total das comissões:" + this.getTotalVendas() );
        System.out.println("salário total recebido: ");
        System.out.println("R$ "+  this.salarioTotal());
    }



}
