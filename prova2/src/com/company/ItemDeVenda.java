package com.company;

public class ItemDeVenda {

    private static int cont =0;
    private int id;
    private String nome;
    private float preco;
    private int estoque = 0;

    public ItemDeVenda( String nome, float preco, int estoque){
        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
        setId(cont++);
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public String toString() {
        return "id: " + this.getId() + "\nnome: "+ this.getNome() +"\nquantidade: "+this.estoque + "\npreço: "+ this.getPreco() + this.getEstoque();
    }

    public void baixarEstoque(int quantidade) throws EstoqueBaixoException{

        if(this.estoque < quantidade){
           throw new EstoqueBaixoException();
        }
        else {
            this.estoque = this.estoque - quantidade;
        }
    }

    public void elevarEstoque(int quantidade){
        this.estoque = this.estoque + quantidade;
    }



}
