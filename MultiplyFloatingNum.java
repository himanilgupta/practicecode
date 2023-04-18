import java.util.Scanner;

public class MultiplyFloatingNum {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first float num:");
        float a = scan.nextFloat();
        System.out.println("Enter second float num:");
        float b = scan.nextFloat();
        System.out.println("Multiplication result should be: "+(a * b));
        scan.close();
    }
}
