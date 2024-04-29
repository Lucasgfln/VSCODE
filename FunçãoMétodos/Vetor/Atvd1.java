package FunçãoMétodos.Vetor;
import java.util.Scanner;

public class Atvd1{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, s_int = 0, qNum;
        System.out.print("Quantos números você deseja saber a média?: ");
        qNum = ler.nextInt();
        int[] valores = new int[qNum];
        for (i = 0; i < valores.length; i++){
            System.out.print("Digite um valor: ");
            valores[i] = ler.nextInt();
            ler.close();
        }
        for (i = 0; i< valores.length; i++){
            s_int += valores[i]; 
        }
        System.out.println(s_int);
        
    }
}