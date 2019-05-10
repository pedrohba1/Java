package com.company;


public class ContaCorrente extends ContaBancaria{
    private String cliente;
    private double taxaDeOperacao = 0;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public double gettaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void settaxaDeOperacao(float taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public void sacar(double valor) {
        if (this.taxaDeOperacao >= valor) {
            this.taxaDeOperacao -=  valor;
        } else
            System.out.println("taxaDeOperacao Insuficiente!");
    }

    public void depositar(double valor){
        this.taxaDeOperacao = this.taxaDeOperacao + valor;
    }


    public ContaCorrente(){
        this.nmrConta = this.cont++;
    }

    @Override
    public void mostrarDados() {


        System.out.println("Nome do cliente: "+ this.getNomeCiente());
        System.out.println("Número da conta: " + this.getnmrConta());
        System.out.println("extrato: R$" + this.gettaxaDeOperacao());
        System.out.println("lançamentos:");

        for(Lancamento lac : this.lancs){
            lac.mostrarDados();
        }

    }
}