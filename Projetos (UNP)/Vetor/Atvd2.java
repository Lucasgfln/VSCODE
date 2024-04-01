import java.util.Scanner;
public class Atvd2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        float s_int = 0;
        float med;
        float[] valores = new float[4];
        for (i = 0; i < valores.length; i++){
            System.out.print("Digite um valor: ");
            valores[i] = ler.nextFloat();
        }
        for (i = 0; i< valores.length; i++){
            s_int += valores[i]; 
        }
        med = s_int/valores.length;
        System.out.print("A média é: " + med);
        ler.close();
    }
    
}
