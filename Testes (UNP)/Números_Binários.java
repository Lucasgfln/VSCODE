import java.util.Scanner;
public class Números_Binários {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        int[] num = new int[10];
        for (i = 0; i < num.length; i++){
                System.out.print("Digite um número: ");
                num = ler.nextInt();
        }
    }
}
