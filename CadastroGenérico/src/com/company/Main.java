package com.company;

public class Main {

    public static void main(String[] args) {
    Elemento a = new Elemento();
    Elemento b = new Elemento();
    Elemento c = new Elemento();

    a.setId(1);
    b.setId(2);
    c.setId(3);

    CadastroGenerico cadastro = new CadastroGenerico();


    cadastro.incluir(a);
    cadastro.incluir(b);
    cadastro.incluir(c);


    cadastro.buscaTodos();
    }
}
