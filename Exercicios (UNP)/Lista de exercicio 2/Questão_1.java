import java.util.Scanner;
public class Questão_1{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float i, IdP;
        String grupo;
        i = 0;
        while (i!=2) {
            System.out.print("Digite o valor do índice de poluição: ");
            IdP = ler.nextFloat();
            if (IdP>=0.5){
                grupo = "As indústrias de todos 3 grupos";
                System.out.println(grupo+" serão suspensas até que o índice de poluição se normalize.");

            }
            else if (IdP>=0.3){
                grupo = "As indústrias do 1º grupo";
                System.out.println(grupo+" serão suspensas até que o índice de poluição se normalize.");

            }
            else if (IdP>=0.4){
                grupo = "As indústrias do 1º e 2º grupo";
                System.out.println(grupo+" serão suspensas até que o índice de poluição se normalize.");
            }
            else {
                System.out.println("Índice de poluição Aceitável.");
            }
            System.out.print("Se você deseja repetir o código digite 1, caso contrário digite 2: ");
            i = ler.nextFloat();
        }
        System.out.print("Concluído. Até a uma próxima.");
        ler.close();
    }   
}