package FunçãoMétodos.Matriz;
import java.util.Scanner;
public class Exercicio_Matriz_3x6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double [] [] matriz = new double[3][6];
        double soma_clns_impares = 0, soma_clns_pares = 0, media;
        int i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 6; j++){
                System.out.print("Digite um Número: ");
                matriz [i] [j] = ler.nextDouble();
            }
        }
        System.out.println();
        System.out.println("A matriz original é:");
        System.out.println();
        for (i = 0; i < 3; i++){
            
            for(j = 0; j < 6; j++){
                System.out.print(" |" + matriz [i] [j] + "| ");
            }
            System.out.println();
            System.out.println();
        }

        for (j = 0; j < 6; j++){
            for (i = 0; i < 3; i++){
                soma_clns_impares = soma_clns_impares + matriz [i] [j];
            }
            j++;   
        }
        System.out.println("A soma de todos os valores da colunas impares são: " + soma_clns_impares);

    }
}
