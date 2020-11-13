import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex_12_15 {

    public static void main(String[] args) throws Exception {
	File file = new File("EX-12-15.txt");
            if(file.exists()){
                System.out.println("File already exists");
                System.exit(0);
            }
            try(
                    PrintWriter output = new PrintWriter(file);
                    ){
                for(int i = 0; i < 100; i++ ){
                    output.print(((int)(Math.random() * 500) + 1));
                    output.print(" ");
                }

            }
        ArrayList<Integer>list = new ArrayList<>();
            try(
                    Scanner scanner = new Scanner(file);
                    ){
                while(scanner.hasNext()){
                    list.add(scanner.nextInt());
                }
            }
        Collections.sort(list);
        System.out.print(list.toString());
        System.out.println();
    }
}
