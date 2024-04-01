import java.util.Scanner;

public class Atvd1_teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String decisao="s";
        int i = 0, n = 0;
        while (decisao == "s") {
            i++;
            int[] valor = new int[i];
            System.out.print("Digite um Valor a ser somado: ");
            valor [i] = ler.nextInt();
            System.out.print("Deseja colocar mais um valor? (s ou n): ");
            decisao = ler.nextLine();
            
        }
        ler.close();
        
    }
}
