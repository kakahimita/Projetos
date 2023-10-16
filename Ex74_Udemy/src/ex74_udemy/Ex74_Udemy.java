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
        
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File folder : folders) {
            System.out.println(folder);
        }
        sc.close();
    }
}
