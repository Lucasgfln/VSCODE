import java.util.Scanner;
public class Cartao_cred {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String num_cartao_string;
        int [] numero_cartao_int = new int[16];
        int i=1, r = 0;
        while (r == 0) {
            do {
                System.out.print("Digite os dígitos do seu cartão (16 dígitos): ");
                num_cartao_string = ler.nextLine();
                
                if (num_cartao_string.length() != 16) {
                    System.out.println("Número de dígitos do cartão inválido. Por favor, insira exatamente 16 dígitos.");
                }
            } while (num_cartao_string.length() != 16);
            
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
            int soma_num_cartao_multiplicado = 0;
            for (i = 0; i < numero_cartao_int.length; i++){
                int num_cartao_multiplicado_base = numero_cartao_int[i] * 2;
                if (num_cartao_multiplicado_base > 9){
                    String num_cartao_multiplicado_string = "" + num_cartao_multiplicado_base;
                    int [] num_cartao_multiplicado_vetor = new int[2];
                    for (int j = 0; j < num_cartao_multiplicado_vetor.length; j++){
                        num_cartao_multiplicado_vetor[j] = num_cartao_multiplicado_string.charAt(j) - 48;
                        soma_num_cartao_multiplicado = soma_num_cartao_multiplicado + num_cartao_multiplicado_vetor[j];         
                    }
                }
                else {
                    soma_num_cartao_multiplicado = soma_num_cartao_multiplicado + num_cartao_multiplicado_base;
                }
                i = i + 1;
    
            }
            for (i = 0; i < 16; i++){
                i = i + 1;
                soma_num_cartao_multiplicado = soma_num_cartao_multiplicado + numero_cartao_int[i];   
    
            }
            switch (soma_num_cartao_multiplicado) {
             case 10:
             System.out.print("Cartão válido!");
             r = 1;
                 break;
    
             case 20:
             System.out.print("Cartão válido!");
             r = 1;
                 break;
                    
             case 30:
             System.out.print("Cartão válido!");
             r = 1;
                 break;
                    
             case 40:
             System.out.print("Cartão válido!");
             r = 1;
                 break;
                    
             case 50:
             System.out.print("Cartão válido!");
             r = 1;
                 break;
                    
             case 60:
             System.out.print("Cartão válido!");
             r = 1;
                 break;
                    
             case 70:
             System.out.print("Cartão válido!");
             r = 1;
                 break;
                    
             case 80:
             System.out.print("Cartão válido!");
             r = 1;
                 break;
                    
             case 90:
             System.out.print("Cartão válido!");
             r = 1;
                 break;
                    
             case 100:
             System.out.print("Cartão válido!");
             r = 1;
                 break;
                    
             default:
             System.out.println("Cartão inválido!");
                 break;
           }
        }
        ler.close();
    }
}
