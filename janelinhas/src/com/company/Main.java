package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {



        String inputValue = JOptionPane.showInputDialog("insira um numero");
        int x = Integer.parseInt(inputValue);
        String inputValue2 = JOptionPane.showInputDialog("insira outro numero");
        int y = Integer.parseInt(inputValue2);
        int result = x + y;


        String s =  Integer.toString(result);
        JOptionPane.showMessageDialog(null, s, s, JOptionPane.INFORMATION_MESSAGE);

    }
}


