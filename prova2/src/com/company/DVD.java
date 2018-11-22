package com.company;

public class DVD extends ItemDeVenda{
    private float duracao;

    public DVD ( String nome, float preco, int estoque, float duracao) {
        super(nome,preco,estoque);
        setDuracao(duracao);
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public float getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nduração: " + this.getDuracao();
     }
}
