import java.util.Scanner;
public class Questão_4_l2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float id = 0, pe = 0, s_id = 0, med_id = 0;
        int i = 1, p90 = 0;
        while (i!=2) {
            while (i<=7) {
                System.out.print("Digite a idade da "+ i +"ª pessoa: ");
                id = ler.nextFloat();
                System.out.print("Digite o peso da "+ i +"ª pessoa: ");
                pe = ler.nextFloat();
                if (pe>90){
                    p90++;
                }
                s_id = s_id + id;
                i++;
            }
            med_id = s_id/7;
            System.out.println(" A média das idades é: "+med_id);
            System.out.println("A quantidade de pessoas acima de 90kg é: " + p90 + " pessoas");
            System.out.print("Se você deseja repetir o código digite 1, caso contrário digite 2: ");
            i = ler.nextInt();
        }
        System.out.print("Concluído. Até a uma próxima.");
        ler.close();
        ler.close();
    }
    
}