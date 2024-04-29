package FunçãoMétodos.Matriz;
import java.util.Scanner;
public class Matrizfrutas {
    public static void main(String[] args) {
        String [] [] frutas = new String[2][3];
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Digite uma fruta: ");
                frutas [i] [j] = ler.nextLine();
                ler.close();
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(frutas [i] [j]);
                
            }
        }
    }
}