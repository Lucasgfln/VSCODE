package While;
import java.util.Scanner;
public class ex_a {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n, inicio = 0;
        System.out.print("Digite um número: ");
        n = ler.nextInt();
        while (inicio<=n) {
            if (inicio%2 == 0){
                System.out.println(inicio);
            }
            inicio ++;
        }
        ler.close();
    }
}
