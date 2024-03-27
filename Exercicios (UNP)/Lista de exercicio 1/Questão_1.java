import java.util.Scanner;
public class Questão_1 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int x1, y1, x2, y2, d;
        System.out.print("Digite x1: ");
        x1 = ler.nextInt();
        System.out.print("Digite y1: ");
        y1 = ler.nextInt();
        System.out.print("Digite x2: ");
        x2 = ler.nextInt();
        System.out.print("Digite y2: ");
        y2 = ler.nextInt();
        d=((x2-x1)^2+(y2-y1)^2)^(1/2);
        ler.close();
        System.out.print("A resposta é: "+d);
    }
}
