package ex74_udemy;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex74_Udemy {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o caminho da pasta: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        //acessando pastas no diretorio
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File folder : folders) {
            System.out.println(folder);
        }
        
        //criando arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }
        
        //criando subpasta
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: " + sucess);
        sc.close();
    }
}
