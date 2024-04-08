import java.util.Scanner;
public class MatrizAtvd3_teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a1, a2, a3, temp;
        a1 = ler.nextInt();
        a2 = ler.nextInt();
        a3 = ler.nextInt();
        if(a1>a2){
            temp = a1;
            a1 = a2;
            a2 = temp;
        }
        if (a2>a3){
            temp = a2;
            a2 = a3;
            a3 = temp;
        }
        if(a1>a2){
            temp = a1;
            a1 = a2;
            a2 = temp;
        }
        
        System.out.println(a1 + ", " + a2 + ", " + a3 + ".");
    }
}
