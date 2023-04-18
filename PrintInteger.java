import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scan.nextInt();
        System.out.println("The number is: "+number);
        scan.close();
    }
}
