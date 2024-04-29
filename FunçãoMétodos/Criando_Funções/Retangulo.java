package FunçãoMétodos.Criando_Funções;
import java.util.Scanner;
public class Retangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float largura, altura, area, perimetro;
        System.out.print("Digite a largura: ");
        largura = ler.nextFloat();
        System.out.print("Digite a altura: ");
        altura = ler.nextFloat();
        area = area_metodo(largura, altura);
        perimetro = perimetro_metodo(largura, altura);
        System.out.println("A área do seu retângulo é: " + area + "\n" 
        + "Seu perímetro é: " + perimetro);
        ler.close();

    }
    public static float area_metodo(float num1, float num2){
        float result = num1 * num2;
        return result;

    }
    public static float perimetro_metodo(float num1, float num2){
        float result = (num1 + num2) * 2;
        return result;
        
    }
}
