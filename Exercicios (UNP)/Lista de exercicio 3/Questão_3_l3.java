import java.util.Scanner;
public class Questão_3_l3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int d, i, temp;
        System.out.print("Digite a quantidade de números que você deseja: ");
        d = ler.nextInt();
        int [] v = new int[d];
        for (i=0; i<v.length; i++){
            System.out.print("Digite um número: ");
            v[i] = ler.nextInt();
            ler.close();
        }
        for (i=0; i<v.length - 1; i++){
            if(v[i]>(v[i+1])){
                temp = v[i];
                v[i] = (v[i+1]);
                (v[i+1]) = temp;
            }
        }
        
        System.out.println(v[d-1]);
    }
}
