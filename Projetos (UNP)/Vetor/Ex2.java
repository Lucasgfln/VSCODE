import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        String[] frutas = new String[6];
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i<6; i++){
            System.out.print("Digite uma Fruta: ");
            frutas[i]= ler.nextLine();

        }
        ler.close();
        for (int i = 0; i<6; i++){
            System.out.println(frutas[i]);
        }
    }
}
