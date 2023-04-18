import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Total_Meal_Cost {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     * Given the meal price (base cost of a meal), tip percent (the percentage of the meal price 
     * being added as tip), and tax percent (the percentage of the meal price being added as tax) 
     * for a meal, find and print the meal's total cost. Round the result to the nearest integer.
     *   Example
     *   A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. 
     *   Print the value  and return from the function.
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
        double tip_given = (meal_cost * tip_percent/100);
        double tax_given = (meal_cost * tax_percent/100);
        int total_meal_cost = (int)Math.round(meal_cost + tip_given + tax_given);
        System.out.println(""+total_meal_cost);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
