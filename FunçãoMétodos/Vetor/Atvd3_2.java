package FunçãoMétodos.Vetor;
import java.util.Scanner;
public class Atvd3_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 0, i, qNum_p =0, decisao;
        System.out.print("Digite até que número você deseja verificar os pares: ");
        decisao = ler.nextInt();
        ler.close();
        for (i = 0; i<=decisao; i++){
            if (i % 2 == 0){
                qNum_p++;
            }
        }
        int [] núm_p = new int[qNum_p];
        for (i = 0; i<=decisao; i++ ){
            if(i % 2 == 0){
                núm_p[n] = i;
                n++;
            }
        }
        for (n = 0; n < núm_p.length; n++){
            System.out.println(núm_p[n]);
        }
        
    }
}
