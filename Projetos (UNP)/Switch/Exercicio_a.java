import java.util.Scanner;
public class Exercicio_a {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.print("Digite um número de 1 a 7, referente aos dias da semana: ");
        n = ler.nextInt();
        switch (n){
            case 2:
            System.out.print("Segunda-Feira");
            break;
            case 3:
            System.out.print("Terça-Feira");
            break;
            case 4:
            System.out.print("Quarta-Feira");
            break;
            case 5:
            System.out.print("Quinta-Feira");
            break;
            case 6:
            System.out.print("Sexta-Feira");
            break;
            case 7:
            System.out.print("Sábado");
            break;
            case 1:
            System.out.print("Domingo");
            break;
            default:
            System.out.print("Número inválido, escolha um número entre 1-7.");
        }
        ler.close();
    }
}
