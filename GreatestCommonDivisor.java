/*

Create a sample program to ask for two integers and return the Greatest Common Divisor using methods.

sample output:  Enter first integer: 45 
                Enter second integer: 75 
                The greatest common divisor for 45 and 75 is 15

 */

import java.util.Scanner;

public class GreatestCommonDivisor {


    public static int function_getGCD(int firstInteger, int secondInteger){

        while (secondInteger != 0){
            int temp = secondInteger;
            secondInteger = firstInteger % secondInteger;
            firstInteger = temp;
        }
        return firstInteger;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Integer: ");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter Second Integer: ");
        int secondInteger = scanner.nextInt();

        int resultGCD = function_getGCD(firstInteger, secondInteger);

        System.out.println("The GCD for " + firstInteger + " and " + secondInteger + " is: " + resultGCD);

        scanner.close();
    }
}