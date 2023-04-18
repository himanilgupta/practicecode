import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double doubleNum = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();
        System.out.println(i+number);
        System.out.println(d+doubleNum);
        String test = s + str;
        System.out.println(test);
        // scan.close;
    }
}