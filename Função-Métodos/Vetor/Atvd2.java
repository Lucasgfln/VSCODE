import java.util.Scanner;
public class Atvd2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, qNum;
        float s_int = 0, med;
        System.out.print("Quantos números você deseja saber a média?: ");
        qNum = ler.nextInt();
        float[] valores = new float[qNum];
        for (i = 0; i < valores.length; i++){
            System.out.print("Digite o "+ (i+1)+ "º número: ");
            valores[i] = ler.nextFloat();
            ler.close();
        }
        for (i = 0; i< valores.length; i++){
            s_int += valores[i]; 
        }
        med = s_int/valores.length;
        System.out.print("A média é: " + med);
        
    }
}
