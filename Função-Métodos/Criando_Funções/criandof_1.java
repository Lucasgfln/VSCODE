import java.util.Scanner;
public class criandof_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, i;
        System.out.print("Digite n1: ");
        n1 = ler.nextInt();
        System.out.print("Digite n2: ");
        n2 = ler.nextInt();
        int resultado = somar (n1, n2);
        System.out.println(resultado);
    }
    public static int somar(int num1, int num2){
        int soma = num1 + num2;
        return soma;
        
    }
    
}