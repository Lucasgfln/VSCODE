package FunçãoMétodos.Matriz;
import java.util.Scanner;
public class Matrizfrutas_2 {
    public static void main(String[] args) {
        String [] [] frutas = new String[2][3];
        Scanner ler = new Scanner(System.in);
        int i = 0, j = 0;
        for( i = 0; i < 2; i++){
            for( j = 0; j < 3; j++){
                System.out.print("Digite uma fruta: ");
                frutas [i] [j] = ler.nextLine();
                ler.close();
            }
        }
        for(i = 0; i < 2; i++){
            for( j = 0; j < 3; j++){
                System.out.println(frutas [i] [j]);
                
            }
        }
        int d = 1, q;
        String f;
        while (d!=0) {
            System.out.print("Digite qual fruta você deseja saber a linha e a coluna: ");
            f = ler.nextLine();
            String frutasd = "";
            for( i = 0; i < 2; i++){
                for( j = 0; j < 3; j++){
                    
                }
            }
            }
            
        }
    }
