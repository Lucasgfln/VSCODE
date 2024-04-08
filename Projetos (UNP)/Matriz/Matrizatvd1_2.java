import java.util.Scanner;
public class Matrizatvd1_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String [] aluno = new String[5];
        float [] [] nota = new float[4][3];
        int i, j, k;
        for (i = 0; i < 5; i++){
            System.out.print("Digite o nome do Aluno: ");
            aluno [i] = ler.nextLine();
            for (j = 0; j < 1; j++){
                for (k = 0; k < 3; k++){
                System.out.print("Digite a " + (k+1) + "ª nota: ");
                nota[i] [j] = ler.nextFloat();
                }
            }
        }
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                for (k = 0; k < 5; k++){
                    System.out.println(aluno + " teve as notas: " + nota);
                }
            }
        }
    }
}
