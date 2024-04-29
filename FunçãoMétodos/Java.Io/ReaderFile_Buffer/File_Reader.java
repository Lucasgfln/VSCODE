import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class File_Reader {
    public static void main(String[] args) {
        try {
            FileReader arquivo = new FileReader("L:/VSCODE/Função-Métodos/Java.Io/Creatfile/Arquivo.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha = leitor.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }
            arquivo.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
            e.printStackTrace();

        }
    }
}
