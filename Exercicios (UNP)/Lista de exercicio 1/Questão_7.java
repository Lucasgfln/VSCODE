import java.util.Scanner;
public class Questão_7 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in); 
        float custoaoc, custodf, pdd, impostos;
        System.out.print("Insira o valor do custo de fárica: ");
        custodf = ler.nextFloat();
        System.out.print("Insira a porcentagem do distribuidor utilizando 0,: ");
        pdd = ler.nextFloat();
        System.out.print("Insira o valor dos impostos utilizando 0,: ");
        impostos = ler.nextFloat();
        custoaoc = custodf+(custodf*pdd)+(custodf*impostos);
        System.out.print("O valor total ao consumidor é: R$"+custoaoc);

        ler.close();
    }

}
