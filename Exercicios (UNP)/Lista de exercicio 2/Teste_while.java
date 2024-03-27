import java.util.Scanner;
public class Teste_while{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float i, n1, n2, r;
        i = 0;
        while (i!=2) {
            System.out.print("Digite o primeiro valor: ");
            n1 = ler.nextFloat();
            System.out.print("Digite o segundo valor: ");
            n2 = ler.nextFloat();
            r = n1+n2;
            System.out.println("Resultado é: "+r);
            System.out.print("Se deseja repetir digite 1, se não digite 2: ");
            i = ler.nextFloat();
        }
        System.out.print("Concluído. Até a uma próxima.");
        ler.close();
    }
}