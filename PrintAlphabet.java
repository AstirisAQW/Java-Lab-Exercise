/*
4. Write a for loop to print out the character set from A-Z.

*/

public class PrintAlphabet {
    public static void main(String[] args) {
        int start = 'A';
        int end = 'Z';

        for (int i = start; i <= end; i++) {
            char currentChar = (char) i;
            System.out.print(currentChar + " ");
        }
    }
}