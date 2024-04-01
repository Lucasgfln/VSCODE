import java.util.Scanner;
public class Exercicio_a{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();

        if (idade>= 18) {
            System.out.print("Você é maior de idade.");

        }
        else {
            System.out.print("Você não é maior de idade");

        }
        ler.close();
    }
}