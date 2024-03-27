import java.util.Scanner;
public class Questão_8{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float a, b, c, d, e, f, X, Y;
        System.out.print("Digite A: ");
        a = ler.nextFloat();
        System.out.print("Digite B: ");
        b = ler.nextFloat();
        System.out.print("Digite C: ");
        c = ler.nextFloat();
        System.out.print("Digite D: ");
        d = ler.nextFloat();
        System.out.print("Digite E: ");
        e = ler.nextFloat();
        System.out.print("Digite F: ");
        f = ler.nextFloat();
        X = ((c*e)-(b*f))/((a*e)-(b*d));
        Y = ((a*f)-(c*d))/((a*e)-(b*d));
        System.out.print(" Os valores de X e Y são respectivamente: "+X+", "+Y);
        ler.close();
    }

}