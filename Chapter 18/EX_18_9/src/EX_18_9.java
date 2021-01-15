import java.util.Scanner;

public class EX_18_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to be reversed: ");
        String str = scanner.nextLine();
        reverse(str);
    }
   static void reverse(String str){
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

}
