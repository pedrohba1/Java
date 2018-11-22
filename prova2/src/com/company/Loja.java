package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Loja {

    public static void main(String[] args) {
        ArrayList<ItemDeVenda> list = new ArrayList<ItemDeVenda>();
        DVD d1 = new DVD("shrek 3", 30, 3, 230);
        list.add(d1);
        Livro l1 = new Livro("A arte da guerra", 100,2,"sun Tzu");
        list.add(l1);
        CD cd1 = new CD(" album daLady Gaga", 30, 0,12);
        list.add(cd1);
        Livro l2 = new Livro("percy jackson o ladrão de raios", 30, 1,"não lembro");
        list.add(l2);
        DVD d2 = new DVD("shrek 2", 30,2,120);
        list.add(d2);

        try{
            cd1.baixarEstoque(3);
        }catch (EstoqueBaixoException e){
           System.out.println(e.getMessage());
        }

        for(ItemDeVenda item : list){
           System.out.println(item.toString());
        }



    }

}
