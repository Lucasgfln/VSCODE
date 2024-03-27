import java.util.Scanner;
public class Questão_6 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int horas, minutos, segundos;
        System.out.print("Digite quantos segundos durou o evento da fábrica: ");
        segundos = ler.nextInt();
        horas = segundos/3600;
        minutos = (segundos%3600)/60;
        segundos = (segundos%3600)%60;
        System.out.print("O evento durou: "+horas+"h"+":"+minutos+"m"+":"+segundos+"s");

        ler.close();
    }
}