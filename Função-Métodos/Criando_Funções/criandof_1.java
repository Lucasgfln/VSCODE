import java.util.Scanner;
public class criandof_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, i, operador;
        System.out.print("Digite 1 para adição, 2 para subtração ou 3 para multiplicação): ");
        operador = ler.nextInt();
        if(operador<1 || operador > 3){
            while (operador < 1 || operador > 3) {
                System.out.print("Número inválido, Digite um Número válido: ");
                operador = ler.nextInt();
            }
        }
        System.out.print("Digite n1: ");
        n1 = ler.nextInt();
        System.out.print("Digite n2: ");
        n2 = ler.nextInt();
        switch (operador) {
            case 1:
            int resultado = adição (n1, n2);
            System.out.println(resultado);
                break;
            case 2:
            resultado = subtração(n1, n2);
            System.out.println(resultado);
                break;
            case 3:
            resultado = multiplicação(n1, n2);
            System.out.println(resultado);
                break;
            default:
                break;
        }
    }
    public static int adição(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public static int subtração(int num1, int num2){
        int result = num1 - num2;
        return result;
    }
    public static int multiplicação(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
}