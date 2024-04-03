import java.util.Scanner;
public class tes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String a;
        a = "n";
        int i = 0;
        i = ler.nextInt();
        if (i>1){
           a = ler.nextLine(); 
        }
        
        System.out.println(a);
    }
}
