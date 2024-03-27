package Desafios;

import java.util.Scanner;
public class d5 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float m, cm;
        System.out.print("Quantos metros são? ");
        m = ler.nextFloat();
        cm = m*100;
        System.out.println(m+"m é igual: "+cm);
        ler.close();
    }
}