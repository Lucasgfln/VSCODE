import java.util.Scanner;

public class Atvd1{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, s_int = 0;
        int[] valores = new int[4];
        for (i = 0; i < valores.length; i++){
            System.out.print("Digite um valor: ");
            valores[i] = ler.nextInt();
        }
        for (i = 0; i< valores.length; i++){
            s_int += valores[i]; 
        }
        System.out.println(s_int);
        ler.close();
    }
}