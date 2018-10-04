package com.company;

import sun.font.TrueTypeFont;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Forca {
  //autor: Pedro Henrique Bufulin de Almeida


    private int vidas;
    private String palavraAdv;
    private String[] advinhadas; //é uma string de palavras, mas na verdade guarda as letras.
    private ArrayList<String> letrasTestadas = new ArrayList<>(); //também guarda letras, apesar de ser sring
;
    public void sorteiaPalavra(){
        String palavras[] = {"aranha", "mosquito", "gato", "cebola", "feijoada","porta"};
        int rand = ThreadLocalRandom.current().nextInt(0, palavras.length ); //encontrie esse método na internet
        this.palavraAdv = palavras[rand];
    }

    public Forca() {
        sorteiaPalavra();
        advinhadas = new String[this.palavraAdv.length()];

        for (int i = 0; i < this.palavraAdv.length(); i++) {
            this.advinhadas[i] = " _ "
            ;  // No lugar de colocar um espaço eu coloquei uma underline com um espaço de cada lado
        }

        this.vidas =6;
    }



    public boolean contemaLetra(char letra) {
        char[] palavraAdvinhar = this.palavraAdv.toCharArray();
        boolean encontrouTodas = false; //tive que criar essa variável porque se eu colocar o retorno dentro do if não
                                        // dá pra encontrar todas as letras iguais na palavra.
        for(int i =0; i < palavraAdvinhar.length; i++){
            if(letra == palavraAdvinhar[i]){
                this.advinhadas[i] = " " + String.valueOf(letra).toUpperCase() + " ";
                String lsetraStr = String.valueOf(letra);

                encontrouTodas = true;
            }
        }

        if(encontrouTodas == true){
            return true;
        }

        return false;
    }

    public boolean testaAdvinhada(String letra){

        for(String adv : this.letrasTestadas){
            if (adv.contains(letra)){

                return true;
            }
        }
        letrasTestadas.add(letra);
        return false;
    }






    public void jogo(){
        boolean endgame = false;

        String letra;
        char letrachar;
        do {
            this.printaAdvinhadas();
            this.printaTestadas();
            System.out.println("qual é a letra?");
            Scanner sc = new Scanner(System.in);
            letra = sc.next();
             letrachar = letra.charAt(0);
            if(this.testaAdvinhada(letra) == true){
                System.out.println("a letra " +letra+ " já foi usada. Tente outra");
            }

            else if(this.contemaLetra(letrachar) == true){
                System.out.println("você acertou a letra");
            }

            else if(this.contemaLetra(letrachar) == false){
                System.out.println("a palavra não contém essa letra");
                System.out.println("você perdeu uma vida");
                this.vidas--;
                System.out.println("ainda tem " + this.vidas + " vida(s)");
            }

            if(this.venceuJogo() == true){
                endgame = true;
            }

            if(this.perdeuJogo() == true){
                endgame = true;
            }

        }while (endgame == false);

        this.printaAdvinhadas();
        if(this.venceuJogo() == true){
            System.out.println("Parabéns, você acertou a palavra!");
        }

        if(this.perdeuJogo() == true){
            System.out.println("você perdeu o jogo!");
        }
    }

    public boolean venceuJogo(){
        for(String s: advinhadas){
            if(s.contains(" _ ")){
                return false;
            }
        }
        return true;
    }

    public boolean perdeuJogo(){
        if (this.vidas == 0){
            return true;
        }
        return false;
    }



    public void printaTestadas(){
        System.out.print("letras testadas:");
        for(String s : this.letrasTestadas){
            System.out.print(s);
        }
        System.out.println();
    }

    public void printaAdvinhadas() {
        System.out.println("letras advinhadas:");
        for (int i = 0; i < this.palavraAdv.length(); i++) {
            System.out.print(advinhadas[i]);
        }
        System.out.println();
    }
}


