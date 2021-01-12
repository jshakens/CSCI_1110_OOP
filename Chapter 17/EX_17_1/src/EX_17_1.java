import java.io.*;
import java.util.Random;

public class EX_17_1 {

    public static void main(String[] args) throws IOException {
        try (
            PrintWriter output = new PrintWriter(new FileOutputStream("C:\\Users\\jshap\\IdeaProjects\\EX_17_1\\src\\Exercise17_01.txt"),true);)
        {
            for (int i = 1; i <= 100; i++) {
                output.print((int)(Math.random() * 100) + " ");
                }
        }
        catch (FileNotFoundException fnfe){
            return;
        }
    }


}

