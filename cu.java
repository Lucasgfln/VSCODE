import java.util.Scanner;
public class cu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        i = ler.nextInt();
        if (i<0){
            System.out.print("Digite o número novamente: ");
            i = ler.nextInt();
        }
    ler.close();
    }
}
