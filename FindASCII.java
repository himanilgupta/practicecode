import java.util.Scanner;

public class FindASCII {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character:");
        char ch = scan.nextLine().toCharArray()[0];
        int ascii = ch;
        System.out.println("ASCII value of "+ch+" is: "+ascii);
        scan.close();
    }
}
