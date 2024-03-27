import java.util.Scanner;
public class Questão_4 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int anos, meses, dias;
        System.out.print("Digite sua idade em dias: ");
        dias = ler.nextInt();
        meses = dias/30;
        anos=dias/365;
        System.out.println("Suam idade em anos: "+anos+ 
                "\n" + " Em meses: "+ meses +
                "\n"+" Em dias: "+dias);
        meses = (dias%365)/30;
        dias = (dias%365)%30;
        System.out.println("Você tem no total: "+anos+" anos " 
                + meses+" meses "+dias+" dias.");
        ler.close();
    }
}