import java.io.File;
import java.io.IOException;
public class Create_File {
    public static void main(String[] args) {
        File arquivo = new File("L:/VSCODE/Função-Métodos/Java.Io/Creatfile/Arquivo.txt");

        try{
            if(arquivo.createNewFile()){
                System.out.println("Arquivo criado com sucesso!");
            }
            else{
                System.out.println("Arquivo já existe!");
            }

        }
        catch(IOException e){
            System.out.println("Ocorreu um erro ao criar um arquivo!!");
            e.printStackTrace();
        }
    }
    
}