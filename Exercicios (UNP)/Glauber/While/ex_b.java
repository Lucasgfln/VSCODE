package While;
import java.util.Scanner;
public class ex_b {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int id, i = 0, s_id = 0, p = 0;
        float m_id;
        while (i!=-1) {
            System.out.print("Digite a idade a ser somada: ");
            id = ler.nextInt();
            s_id = s_id+id;
            System.out.println("Idade somada: "+s_id);
            System.out.print("Se deseja adicionar mais uma idade, digite 0, caso contrário digite -1: ");
            i = ler.nextInt();
            
            p++;
        }
        m_id = s_id/p;
        System.out.println("A média de todas as idades é: "+ m_id);
        ler.close(); 
    }
}
