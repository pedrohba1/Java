package com.company;

public class Lancamento {
    //Autor: Pedro Henrique Bufulin
    
    private String data;
    private boolean C;
    private boolean D;
    private String historico;
    private float valor;


    public String getTipo(){
        if(C == true){
            return "C";
        }
        if(D == true){
            return "D";
        }
        return "nao tem tipo";
    }


    public String getData() {
        return data;
    }

    public String getHistorico() {
        return historico;
    }

    public float getValor() {
        return valor;
    }

    public Lancamento(boolean C, boolean D, String historico, float valor){
        data = "27/09/2018";
        this.C = C;
        this. D = D;
        this.historico = historico;
        this.valor = valor;
    }


}
