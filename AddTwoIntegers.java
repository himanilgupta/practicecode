import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int a = scan.nextInt();
        System.out.println("Enter second integer:");
        int b = scan.nextInt();
        System.out.println("Addition result should be: "+(a + b));
        scan.close();
    }
}