import java.util.Scanner;
public class Exercicio_a_S {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n, d = 0;
        System.out.print("Digite um número de 1 a 7, referente aos dias da semana: ");
        n = ler.nextInt();
        while (d==0) {
            d=1;
         switch (n){
            case 2:
            System.out.println("Segunda-Feira");
            break;
            case 3:
            System.out.println("Terça-Feira");
            break;
            case 4:
            System.out.println("Quarta-Feira");
            break;
            case 5:
            System.out.println("Quinta-Feira");
            break;
            case 6:
            System.out.println("Sexta-Feira");
            break;
            case 7:
            System.out.println("Sábado");
            break;
            case 1:
            System.out.println("Domingo");
            break;
            default:
            System.out.println("Número inválido, escolha um número entre 1-7.");
            System.out.print("Digite um número de 1 a 7, referente aos dias da semana: ");
            n = ler.nextInt();
            d = 0;
                }    
            }
            ler.close();
        }   
    }