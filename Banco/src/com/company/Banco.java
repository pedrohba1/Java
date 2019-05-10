        package com.company;
import javax.swing.JOptionPane;

public class Banco {

    private ContaCorrente[] contas;
    private int cont;
    private final int MAX_CONTAS = 10;

    public Banco() {
        contas = new ContaCorrente[MAX_CONTAS];
    }

    public ContaCorrente abrirConta(String cliente, float valor){
        ContaCorrente cc = new ContaCorrente();
        contas[cont++] = cc;
        cc.setCliente(cliente);
        cc.setNum_conta(cont);
        cc.depositar(valor);
        return cc;
    }

    public ContaEspecial abrirContaEspecial (String cliente, float valor, float limite){
        ContaEspecial cc = new ContaEspecial();
        contas[cont++] = cc;
        cc.setCliente(cliente);
        cc.setNum_conta(cont);
        cc.depositar(valor);
        cc.setLimite(limite);
        return cc;
    }

    public void listarContas(){
        for (int i = 0; i < cont; i++) {
            ContaCorrente contaCorrente = contas[i];
            contaCorrente.mostrarSaldo();
        }
    }


}