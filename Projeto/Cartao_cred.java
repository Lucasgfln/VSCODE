import java.util.Scanner;
public class Cartao_cred {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String num_cartao_string;
        int [] numero_cartao_int = new int[16];
        int soma, i=1;
        do {
            System.out.print("Digite os dígitos do seu cartão (16 dígitos): ");
            num_cartao_string = ler.nextLine();
            
            if (num_cartao_string.length() != 16) {
                System.out.println("Número de dígitos do cartão inválido. Por favor, insira exatamente 16 dígitos.");
            }
        } while (num_cartao_string.length() != 16);
        ler.close();
        
        for (i = 0; i < numero_cartao_int.length; i++){
            numero_cartao_int [i] = num_cartao_string.charAt(i) - 48;        
        }
        switch (numero_cartao_int[0]) {
            case 3:
                if (numero_cartao_int [1] == 4 || numero_cartao_int[1] == 7) {
                    System.out.println("Bandeira do cartão é American Express");
                }
                else{
                    System.out.println("Outra bandeira");
                }
                break;
            case 4:
            System.out.println("Bandeira do cartão é Visa");
                break;
            case 5:
                if (numero_cartao_int[1]>0 && numero_cartao_int[1]<6 ){
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
        for (i = 0; i < numero_cartao_int.length; i++){
            
        }
    }
}
