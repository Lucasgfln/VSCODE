package IF;
import java.util.Scanner;
public class Exercicio_b{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.print("Digite um número: ");
        n = ler.nextInt();
        if (n<0){
            System.out.print("Seu Número é Negativo.");
        }
        else if (n>0){
            System.out.print(" Seu Número é Positivo.");
        }
        else {
            System.out.print("Seu Número é Zero.");
            
        }
        ler.close();
    }
    
}
