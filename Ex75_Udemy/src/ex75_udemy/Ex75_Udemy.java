package ex75_udemy;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex75_Udemy {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o caminho da pasta: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        System.out.println("getNome: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        
        sc.close();
    }

}
