package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Banco bb = new Banco();
        String nome = JOptionPane.showInputDialog(null,
                "Informe o nome do cliente");
        float valor=0f;
        valor = Float.parseFloat(
                JOptionPane.showInputDialog(null,
                        "Informe o valor inicial ser depositado") );
        ContaCorrente cc = bb.abrirConta(nome, valor);
        cc.depositar(3000F);
        cc.sacar(5000f);
        cc.mostrarSaldo();
        cc = bb.abrirConta("Lopes", 1000f);
        cc.depositar(3000F);
        cc.sacar(5000f);
        cc.mostrarSaldo();

        ContaEspecial ce = bb.abrirContaEspecial("Salim",200f, 100f);
        ce.sacar(250f);
        bb.listarContas();

    }


}
