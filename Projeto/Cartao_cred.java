import java.util.Scanner;
public class Cartao_cred {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String num_c;
        int [] numero_cartao = new int[16];
        int soma, i;
        System.out.print("Digite os dígitos do seu cartão: ");
        num_c = ler.nextLine();
        for (i = 0; i < numero_cartao.length; i++){
            numero_cartao [i] = num_c.charAt(i) - 48;
            System.out.println(numero_cartao[i]);
        }
        switch (numero_cartao[0]) {
            case 3:
                System.out.println("Bandeira do cartão é American Express");
                break;
            case 4:
            System.out.println("Bandeira do cartão é Visa");
                break;
            case 5:
                if (numero_cartao[1]>0 && numero_cartao[1]<6 ){
                    System.out.println("Bandeira do cartão é Mastercard");
                }
                else{
                    System.out.println("Bandeira do cartão é Maestro");
                }
                break;
            case 6:
                System.out.println("Bandeira do cartão é Maestro");
                break;
            default:
            System.out.println("Outra bandeira");
                break;
        }
    }
}
