import java.util.Scanner;
public class AtvF_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        
        int resultado = maior_entre(ler.nextInt(), ler.nextInt());
        System.out.print("O maior número é: " + resultado);
    }
    public static int maior_entre(int n1, int n2){
        int result = Math.max(n1, n2);
        return result;
    }
}