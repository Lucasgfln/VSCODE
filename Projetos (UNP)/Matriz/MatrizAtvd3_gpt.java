import java.util.Scanner;
public class MatrizAtvd3_gpt {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
         int [] [] matriz = new int[4][4];
         int i, j, temp;
         for(i = 0; i<4; i++){
            for(j = 0; j<4; j++){
                System.out.print("Digite um número: ");
                matriz [i][j] = ler.nextInt();
            }
         }
         for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                for (int k = 0; k < 4 - 1; k++) {
                    for (int l = 0; l < 4 - k - 1; l++) {
                        if (matriz[l][i] > matriz[l + 1][i]) {
                            temp = matriz[l][i];
                            matriz[l][i] = matriz[l + 1][i];
                            matriz[l + 1][i] = temp;
                        }
                    }
                }
            }
        }

          for( i = 0; i<4; i++){
            for(j = 0; j<4; j++){
                System.out.println(matriz [i] [j]);
            }
        }
    }
}