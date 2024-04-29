package FunçãoMétodos.Criando_Funções;
import java.util.Scanner;
public class Retangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float largura, altura;
        System.out.print("Digite a largura: ");
        largura = ler.nextFloat();
        System.out.print("Digite a altura: ");
        altura = ler.nextFloat();
        float area = area_metodo(largura, altura);
        System.out.println(area);

    }
    public static float area_metodo(float num1, float num2){
        float result = num1 * num2;
        return result;
    }
}
