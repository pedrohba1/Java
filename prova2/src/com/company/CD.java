package com.company;

public class CD extends ItemDeVenda {
    private int nFaixas;


    public CD( String nome, float preco, int estoque, int nFaixas){
        super(nome,preco,estoque);
        setnFaixas(nFaixas);
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    public int getnFaixas() {
        return nFaixas;
    }

    @Override
    public String toString() {
    return super.toString() + "\nnumero de faixas: " + this.getnFaixas();
    }
}
