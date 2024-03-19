/*
Create a program that will accept a decimal value input and then choose to either convert
it to one of the following number systems:
    1 – Decimal to Binary
    2 – Decimal to Octal
    3 – Decimal to Hexadecimal
    
    USE ARRAYS TO FORM THE NEWLY CONVERTED NUMBER


Sample Output:
                Enter a positive decimal value: 14
                value to which number system:
                1 – Decimal to Binary
                2 – Decimal to Octal
                3 – Decimal to Hexadecimal
                
                Enter choice: 1
                Equivalent of 14 in binary is 1110
 */




import java.util.Scanner;

public class ConvertToNumberSystems {

    public static int[] decimalToBinary(int decimal) {
        if (decimal == 0) {
            return new int[] {0};
        }
        int[] binary = new int[32];
        int index = 0;

        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal /= 2;
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = binary[index - 1 - i];
        }
        return result;
    }

    public static int[] decimalToOctal(int decimal) {
        if (decimal == 0) {
            return new int[] {0};
        }
        int[] octal = new int[32];
        int index = 0;
        while (decimal > 0) {
            octal[index++] = decimal % 8;
            decimal /= 8;
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = octal[index - 1 - i];
        }
        return result;
    }

    public static char[] decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return new char[] {'0'};
        }
        char[] hexadecimal = new char[32];
        int index = 0;
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal[index++] = (char) ('0' + remainder);
            } else {
                hexadecimal[index++] = (char) ('A' + remainder - 10);
            }
            decimal /= 16;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = hexadecimal[index - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive decimal value: ");
        int decimal = scanner.nextInt();

        System.out.println("Value to which number system:");
        System.out.println("1 - Decimal to Binary");
        System.out.println("2 - Decimal to Octal");
        System.out.println("3 - Decimal to Hexadecimal");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        scanner.close();


        switch (choice) {
            case 1:
                int[] binaryResult = decimalToBinary(decimal);
                System.out.print("Equivalent of " + decimal + " in binary is ");
                for (int digit : binaryResult) {
                    System.out.print(digit);
                }
                break;
            case 2:
                int[] octalResult = decimalToOctal(decimal);
                System.out.print("Equivalent of " + decimal + " in octal is ");
                for (int digit : octalResult) {
                    System.out.print(digit);
                }
                break;
            case 3:
                char[] hexadecimalResult = decimalToHexadecimal(decimal);
                System.out.print("Equivalent of " + decimal + " in hexadecimal is 0x");
                for (char digit : hexadecimalResult) {
                    System.out.print(digit);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
