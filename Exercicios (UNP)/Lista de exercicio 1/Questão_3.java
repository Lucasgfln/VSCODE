import java.util.Scanner;
public class Questão_3{
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int anos, meses, dias, diastotais;
        System.out.println("Digite sua sua idade abaixo:");
        System.out.print("Anos: ");
        anos = ler.nextInt();
        System.out.print("Meses: ");
        meses = ler.nextInt();
        System.out.print("Dias: ");
        dias =ler.nextInt(); 
        diastotais = (anos*365) + (meses*30) + (dias);
        System.out.println("Você tem no total " + diastotais + " Dias");
        ler.close();
        }
}