import java.util.Scanner;
public class Números_Binários {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, i;
        System.out.print("Digite um número que vai ser convertido em Binário: ");
        num = ler.nextInt();
        ler.close();
        for (i = 0; i < num; i++){
            System.out.print((num%2));
            num = num/2;
        }
    }
}
