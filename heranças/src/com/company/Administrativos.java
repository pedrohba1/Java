package com.company;

public class Administrativos extends Funcionarios {
        private int horasExtras = 0;

    public void acumulaHextras (int horas){
        this.horasExtras += horas;
    }

    public float salarioTotal (){
        float total;
        total = this.horasExtras*(this.salarioBase/100) + this.salarioBase;
        this.horasExtras = 0;
        return total;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void finalizaTotal(){
        System.out.println("quantidade de horas extras" + this. getHorasExtras());
        System.out.println("salário total recebido: ");
        System.out.println("R$ "+  this.salarioTotal());
    }
}
