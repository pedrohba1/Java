package com.company;

public class Vendedores extends Funcionarios {
    private float totalVendas = 0;


    public void acumulaVendas(int vendas){
        this.totalVendas += vendas;
    }

    public float salarioTotal(){
        float total;
        total = (5*(this.totalVendas)/100) + this.salarioBase;
        return total;
    }


}
