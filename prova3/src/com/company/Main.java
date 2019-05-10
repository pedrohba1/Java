package com.company;

import sun.reflect.LangReflectAccess;

public class Main {

    public static void main(String[] args) {
	Banco b = new Banco();
	b.novaConta('E', "Paquá");
    b.novaConta('C', "Pedro");


    Lancamento l = new Lancamento(30,true,false);
    b.procurarConta(0).lancs.add(l);
    b.procurarConta(0).depositar(30);


    Lancamento l2 = new Lancamento(100,true,false);
    b.procurarConta(1).lancs.add(l2);
    b.procurarConta(1).depositar(100);


    Lancamento l3 = new Lancamento(200,false,true);
    b.procurarConta(0).lancs.add(l3);
    b.procurarConta(0).sacar(200);


    Lancamento l4 = new Lancamento(30,false,true);
    b.procurarConta(1).lancs.add(l4);
    b.procurarConta(1).sacar(30);



    Relatorio r = new Relatorio();

    r.gerarRelatorio(b);


    }
}
