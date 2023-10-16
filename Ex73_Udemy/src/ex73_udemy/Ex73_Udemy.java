package ex73_udemy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kakah
 */
public class Ex73_Udemy {

    public static void main(String[] args) {

        String[] lines = new String[]{" good morning "};

        String path = "c:\\Users\\kakah\\Documents\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
