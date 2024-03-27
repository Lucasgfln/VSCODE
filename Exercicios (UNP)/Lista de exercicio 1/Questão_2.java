import java.util.Scanner;
public class Questão_2 {
    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);
        int a, b, c, d, R, S;
        System.out.print("Digite A: ");
        a = ler.nextInt();
        while (a<0) {
            System.out.print("Número invalido, digite A novamente: ");
            a = ler.nextInt();
        }

        System.out.print("Digite B: ");
        b = ler.nextInt();
        while (b<0) {
            System.out.print("Número invalido, digite B novamente: ");
            b = ler.nextInt();
        }
        System.out.print("Digite C: ");
        c = ler.nextInt();
        while (c<0) {
            System.out.print("Número invalido, digite C novamente: ");
            c = ler.nextInt();
        }
       R= (a+b)*(a+b);
       S=(int)Math.pow((a+b),2);
       d=(R+S)/2;
       System.out.print("A resposta é: "+d);
       ler.close();
    }
}
