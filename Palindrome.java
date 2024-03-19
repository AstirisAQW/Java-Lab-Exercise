/*
1. Create a program using ARRAY that will check if a given word is a palindrome or not a palindrome.

 */

import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(String userInput_Word){
        int length = userInput_Word.length();
        char[] characters = userInput_Word.toCharArray();

        for (int i = 0; i < length / 2; i++){
            if (characters[i] != characters[length - 1 - i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Word: ");
        String userInput_Word = scanner.nextLine();
        scanner.close();


        if (checkPalindrome(userInput_Word)){
            System.out.println(userInput_Word + " is a palindrome.");

        }else{
            System.out.println(userInput_Word + " isn't a Palindrome");
        }   
    }
}
