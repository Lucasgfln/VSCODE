package Desafios;
import java.util.Scanner;
public class d3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float n1, n2;
        System.out.print("Digite n1: ");
        n1=ler.nextFloat();
        System.out.print("Digite n2: ");
        n2=ler.nextFloat();
        System.out.print("A soma é: "+ (n1+n2));
        ler.close();
    }
}