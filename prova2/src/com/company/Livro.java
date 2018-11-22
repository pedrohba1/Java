package com.company;

public class Livro extends ItemDeVenda {
    private String autor;

    public Livro(String nome, float preco, int estoque, String autor){
        super(nome,preco,estoque);
        setAutor(autor);
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nautor: " + this.getAutor() ;
    }
}
