package ex071_udemy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex071_Udemy {

    public static void main(String[] args) {

        File file = new File("c:\\Users\\kakah\\Documents\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine()
                );
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
