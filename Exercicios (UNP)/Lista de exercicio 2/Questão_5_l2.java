import java.util.Scanner;
public class Questão_5_l2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = -1;
        float a, b, c;
        int finalizar = 0;
        while (finalizar!=2) {
            System.out.print("Digite um Número inteiro e positivo entre 1, 2 e 3: ");
            i = ler.nextInt();
            while (i < 1 | i > 3) {
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
                System.out.println("Os números em ordem crescente são: "+ a + ", " + b + ", " + c);
                    break;
            case 2:
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
                System.out.println("Os números em ordem crescente são: "+ c + ", " + b + ", " + a);
                    break;
            case 3:
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
                System.out.println("Os números em ordem crescente são: "+ b + ", " + a + ", " + c);
                    break;
        
                default:
                    break;
            }
            System.out.print("Se você deseja repetir o código digite 1, caso contrário digite 2: ");
            finalizar = ler.nextInt();
        }
        System.out.print("Concluído. Até a uma próxima.");
        ler.close();
    }
}
