import java.util.Scanner;
public class Questão_5_l2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = -1;
        float a, b, c;
        System.out.print("Digite um Número inteiro e positivo entre 1, 2 e 3: ");
        i = ler.nextInt();
        while (i < 0 | i > 3) {
            System.out.print("Número inválido, digite um Número inteiro e positivo entre 1, 2 e 3: ");
            i = ler.nextInt();
        }
        System.out.print("Digite A: ");
        a = ler.nextFloat();
        System.out.print("Digite B: ");
        b = ler.nextFloat();
        System.out.print("Digite C: ");
        c = ler.nextFloat();
        switch (i) {
            case 1:
            if(a>b){
                float temp = a;
                a = b;
                b = temp;
            }
            if(b>c){
                float temp = b;
                b = c;
                c = temp;
            }
            if (a>b){
                float temp = a;
                a = b;
                b = temp;
            }
            System.out.print("Os números em ordem crescente são: "+ a + ", " + b + ", " + c);
                break;
            case 2:
                
                break;
            case 3:
                
                break;
        
            default:
                break;
        }
        ler.close();
    }
}
