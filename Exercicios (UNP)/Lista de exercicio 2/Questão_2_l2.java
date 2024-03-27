import java.util.Scanner;
public class Questão_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float a, b, c, d, e, mx, mn;
        a=-1;
        b=-1;
        c=-1;
        d=-1;
        e=-1;
        while (a<0) {
            System.out.print("Digite a: ");
            a = ler.nextFloat();
            if (a<0){
                System.out.println("Número inválido, digite novamente.");
            }
        }
        while (b<0) {
            System.out.print("Digite b: ");
            b = ler.nextFloat();
            if (b<0){
                System.out.println("Número inválido, digite novamente.");
            }
        }
        while (c<0) {
            System.out.print("Digite c: ");
            c = ler.nextFloat();
            if (c<0){
                System.out.println("Número inválido, digite novamente.");
            }
        }
        while (d<0) {
            System.out.print("Digite d: ");
            d = ler.nextFloat();
            if (d<0){
                System.out.println("Número inválido, digite novamente.");
            }
        }
        while (e<0) {
            System.out.print("Digite e: ");
            e = ler.nextFloat();
            if (e<0){
                System.out.println("Número inválido, digite novamente.");
            }
        }
        mx = Math.max(Math.max(a, b), Math.max(Math.max(c,d), e));
        mn = Math.min(Math.min(a, b), Math.min(Math.min(c,d), e));
        System.out.print("O maior e o menor número são respectivamente: " +mx+ " e "+mn);
        ler.close();
    }
}