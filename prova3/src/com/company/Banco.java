package com.company;

import java.util.ArrayList;

public class Banco implements  Imprimivel{
    private ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

    public void novaConta (char c, String nomecliente){
        if(c == 'E'){
            ContaBancaria c1 = new ContaEspecial(200);
            c1.setNomeCiente(nomecliente);
            contas.add(c1);
        }
        else if (c == 'C'){
            ContaBancaria c1 = new ContaCorrente();
            c1.setNomeCiente(nomecliente);
            contas.add(c1);
        }
        else {
            System.out.println("erro, digite uma letra válida, C ou E");
        }

    }


    public void fecharConta(int nmr){

        ContaBancaria c1 = procurarConta(nmr);
        if (c1 == null) return;
        contas.remove(c1);

    }


    public ContaBancaria procurarConta(int nmr) {

        for (ContaBancaria c : this.contas) {
            if (c.getNmrConta() == nmr){
                return c;
            }
        }


        System.out.println("conta não encontrada");
        return null;
    }

    @Override
    public void mostrarDados() {
        for(ContaBancaria c : contas){
            c.mostrarDados();
        }
    }
}
