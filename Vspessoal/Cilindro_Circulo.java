package Vspessoal;
import java.util.Scanner;

public class Cilindro_Circulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float raio, altura;
        int decisão, i = 0;
    
        do {
            System.out.print("Digite 1 para círculo ou 2 para cilindro: ");
            decisão = ler.nextInt();
            System.out.println("");
            System.out.print("Digite o valor do raio: ");
            raio = ler.nextInt();
            System.out.println("");
            if (decisão == 1) {
                double area_circulo = area_crcl_metodo(raio);
                double circunferencia = circunferencia_metodo(raio);
                System.out.println("Área do círculo é: " + area_circulo + "\n" 
                + "Circunferência do círculo é: " + circunferencia);
            }
            if (decisão == 2){
                System.out.print("Digite a altura do cilindro: ");
                altura = ler.nextInt();
                System.out.println("");
                float area_circulo = area_crcl_metodo(raio);
                float area_cilindro = area_clndr_metodo(raio, altura);
                float volume = volume_metodo(area_circulo, altura);
                System.out.printf("A área do cilindro é: " + String.format("%.2f", area_cilindro) + "\n" + 
                "O volume do cilindro é: " + String.format("%.2f", volume));
            }
            System.out.println("");
            System.out.print("Se você deseja repetir digite 1, se não digite 2: ");
            i = ler.nextInt();
            System.out.println("");
            System.out.println("");
            
        } while ((i != 2));
        System.out.println("Até a próxima!!");
        ler.close();
    }
    public static float area_crcl_metodo(float num1){
        float resultado = 3.14f * (num1*num1);
        return resultado;
    }
    public static float circunferencia_metodo(float num1){
        float resultado = 2 * 3.14f * num1;
        return resultado;
    }
    public static float area_clndr_metodo(float num1, float num2){
        float resultado = (area_crcl_metodo(num1) * 2) + (circunferencia_metodo(num1) * num2);
        return resultado;
    }
    public static float volume_metodo(float num1, float num2){
        float resultado = num1 * num2;
        return resultado;
    }  
}
