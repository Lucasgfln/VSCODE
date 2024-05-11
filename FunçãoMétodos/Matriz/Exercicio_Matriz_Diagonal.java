package FunçãoMétodos.Matriz;
import java.util.Scanner;
public class Exercicio_Matriz_Diagonal{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] [] matriz = new int[3][3];
        int i, j, soma_diagonal = 0;
        matriz [1] [1] = 0; 
        for (i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print("Digite um número: ");
                matriz [i] [j] = ler.nextInt();
            }
        }

        for (i = 0; i < 3; i++){
            soma_diagonal = soma_diagonal + matriz [i] [i];
        }

        for (i = 0; i < 3; i++){
            System.out.print("|");
            for(j = 0; j < 3; j++){
                System.out.print(matriz [i] [j] + "|");
            }
            System.out.println();
        }
        ler.close();
        System.out.println("A soma da diagonal principal da matriz é: " + soma_diagonal);
    }

}