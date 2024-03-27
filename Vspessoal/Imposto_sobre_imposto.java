import java.util.Scanner;
public class Imposto_sobre_imposto{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float devendo, dias;
        System.out.print("Quanto eu tô devendo: ");
        devendo = ler.nextFloat();
        System.out.print("Quantos dias de imposto: ");
        dias = ler.nextFloat();
        while (dias>0) {
            devendo = devendo + devendo;
            dias = dias-1;
        }
        System.out.print("Você está devendo no total: R$"+devendo);
        ler.close();
    }

}