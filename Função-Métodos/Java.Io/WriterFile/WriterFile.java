import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("L:/VSCODE/Função-Métodos/Java.Io/Creatfile/Arquivo.txt");

            writer.write("Olá! Essa é a primeira linha"+"\n");
            writer.write("Olá! Essa é a Segunda linha"+"\n");
            writer.write("Olá! Essa é a terceira linha"+"\n");
            writer.close();

            System.out.println("Arquivo gravado com sucesso!");
        }
        catch(IOException e){
            System.out.println("Erro ao gravar no arquivo!!");
            e.printStackTrace();

        }

    }
}
