package Desafios;
import java.util.Scanner;
public class d4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float n1, n2, n3, n4, mf;
        System.out.print("Digite a a nota do 1º Bim.: ");
        n1 = ler.nextFloat();
        System.out.print("Digite a a nota do 2º Bim.: ");
        n2 = ler.nextFloat();
        System.out.print("Digite a a nota do 3º Bim.: ");
        n3 = ler.nextFloat();
        System.out.print("Digite a a nota do 4º Bim.: ");
        n4 = ler.nextFloat();
        mf = (n1+n2+n3+n4)/4;
        System.out.println("A média final é: "+mf+".");
        ler.close();
    }
}
