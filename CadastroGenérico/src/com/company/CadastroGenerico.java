package com.company;


import java.util.ArrayList;

    public class CadastroGenerico {


        private ArrayList<Elemento> ListaElementos = new ArrayList<>();


        public void incluir(Elemento elem) {
            ListaElementos.add(elem);
        }


        public void excluir(int id) {
            for (Elemento elemento : ListaElementos) {
                if (elemento.getId() == id) {
                    ListaElementos.remove(elemento);
                }
            }
        }

        public Elemento busca(int id){
            for(Elemento elemento : ListaElementos) {
                if (elemento.getId() == id) {
                    return elemento;
                }
            }
            Elemento vazio = new Elemento();
            vazio.setId(-1);
            return vazio;
        }

        public void buscaTodos(){
            for(Elemento elemento : ListaElementos){
                System.out.print(elemento.getId() + " ");
            }
        }

        public int nroElementos(){
            return ListaElementos.size();
        }

    }



