package Desafios;
import java.util.Scanner;
public class d2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.print("Digite um número: ");
        n = ler.nextInt();
        System.out.print("O número informado foi " + n + ".");
        ler.close();
    }
}