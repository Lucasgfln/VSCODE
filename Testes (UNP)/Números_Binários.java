import java.util.Scanner;
public class Números_Binários {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        int[] num = new int[10];
        for (i = 0; i < num.length; i++) {
                System.out.print("Digite um número: ");
                num[i] = ler.nextInt();
                ler.close();
        }
        for (i = 0; i < num.length; i++) {
                System.out.println(num[i]);
                i = i+1;
        }
        for (i = 0; i < num.length; i++) {
                i = i+1;
                System.out.println(num[i]);
                
        }
    }
}
