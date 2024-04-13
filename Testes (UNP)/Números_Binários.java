import java.util.Scanner;
public class Números_Binários {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, i;
        System.out.print("Digite um número que vai ser convertido em Binário: ");
        num = ler.nextInt();
<<<<<<< HEAD
        ler.close();
=======
>>>>>>> b4dba70dc72b994356417cd26692ad7b0f049df4
        for (i = 0; i < num; i++){
            System.out.print((num%2));
            num = num/2;
        }
<<<<<<< HEAD
=======
        ler.close();
>>>>>>> b4dba70dc72b994356417cd26692ad7b0f049df4
    }
}
