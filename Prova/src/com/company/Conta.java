package com.company;

import java.util.ArrayList;

public class Conta {
    //Autor: Pedro Henrique Bufulin
    private static int cont = 0;
    private int nroConta;
    Cliente cliente;
    private ArrayList<Lancamento> ListaHistorico = new ArrayList<>();
    public Conta(Cliente c){
    this.nroConta = cont++;
    this.cliente = c;
    }


    public void adicione(boolean C, boolean D,String historico, float valor){



        Lancamento lanc = new Lancamento(C,D,historico,valor);
        ListaHistorico.add(lanc);
    }


    public void Listar(){
        for(Lancamento lanc : ListaHistorico){
            System.out.println("Data " + lanc.getData());
            System.out.println("tipo: " + lanc.getTipo());
            System.out.println("historico: " + lanc.getHistorico());
            System.out.println("valor: "+ lanc.getValor());
        }
    }

    public float CalculaSaldo() {
        
        float total=0;
        for (Lancamento lanc : ListaHistorico) {
            total += lanc.getValor();
           
     
        }
        return total;
    }

    
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public int getNroConta() {
        return nroConta;
    }
    

    public static void main(String[] args) {
        //Autor: Pedro Henrique Bufulin
        Cliente a = new Cliente("pedro");
        
        Conta a1 = new Conta(a);
        
       a1.adicione(true,false,"lancamento no credito",300);
       a1.adicione(false,true,"lancameto no credito",500);
      
       
       a1.Listar();


       System.out.println("valor total de saldo:" + a1.CalculaSaldo());
    }
    
    
}

