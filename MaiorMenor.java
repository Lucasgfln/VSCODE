import java.util.Scanner;

public class MaiorMenor {
   public static int maiornum;
    public static int menornum;
    public static int num;
    public static void main(String[] args) {

       int x =0;
       int i =0;

        Scanner teclado = new Scanner(System.in);
       
        while (x==0) {
            for (i=0;i<5;i++){
                System.out.print("Digite um numero:  ");
                num=teclado.nextInt();

               
                 if (num<0) {
                     System.out.println("Números negativos não são permitidos digite outra vez:");
                     num=teclado.nextInt();
                 }   
                  else{
                    if (i==0) {
                        maiornum=num;
                        menornum=num;
                    }
                    else{

                        if (maiornum<=num) {
                            maiornum=num;
                           
                         }   
                         if (menornum>=num) {
                             menornum=num;
                         } 
                    }

                   System.out.println(maiornum);
                   System.out.println(menornum);
                
                 }
  
            }
        System.out.println("D:");
        x= teclado.nextInt();
        }

    }
}
