package com.company;

public class Main {

    public static void main(String[] args) {

    Aluno a = new Aluno();
    Aluno b = new Aluno();
    Aluno c = new Aluno();
    a.setId(10);
    b.setId(20);
    c.setId(30);
    CadastroAlunos cadastro = new CadastroAlunos();

    cadastro.incluir(a);
    cadastro.incluir(b);
    cadastro.incluir(c);

    cadastro.buscaTodos();



    System.out.println(cadastro.nroElementos());
    cadastro.excluir(20);
    cadastro.excluir(10);


    System.out.println(cadastro.nroElementos());

    }
}
