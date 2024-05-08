import java.util.Scanner;
public class Matriz_prova {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double [] [] matriz = new double[4][5];
        double [] vetor = new double[5];
        int i, j;
        double soma = 0;
        for (j = 0; j < 5; j++){
            for (i = 0; i < 4; i++){
                System.out.print("Digite um número na coluna " + (j+1) + " linha " + (i+1) + ": ");
                matriz [i] [j] = ler.nextDouble();
                soma = soma + matriz [i] [j];
            }
            vetor [j] = soma;
            soma = 0;    
        }
        System.out.println();
        

        for (i = 0; i < 4; i++){
            for (j = 0; j < 5; j++){
                System.out.print(matriz [i] [j] + " | ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (i = 0; i < 5; i++){
            System.out.println("Vetor " + (i+1) + "= " + vetor [i]);
        }
    }

}
