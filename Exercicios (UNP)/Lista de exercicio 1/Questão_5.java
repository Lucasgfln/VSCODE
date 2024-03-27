import java.util.Scanner;
public class Questão_5 {
    public static void main(String[] args){
        Scanner ler=new Scanner(System.in);
        float n1, n2, n3, MF;
        String nda;
        System.out.print("Digite o Nome do Aluno: ");
        nda = ler.nextLine();
        System.out.print("Digite a primeira nota: ");
        n1 = ler.nextFloat();
        System.out.print("Digite a segunda nota: ");
        n2 = ler.nextFloat();
        System.out.print("Digite a terceira nota: ");
        n3 = ler.nextFloat();
        MF = ((n1*2)+(n2*3)+(n3*5))/10;
        System.out.println("A nota do aluno "+nda+" é: "+MF);
        ler.close();
    }
    
}
