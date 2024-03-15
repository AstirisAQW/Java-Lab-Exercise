/*
Laboratory Exercises
1. Enhance the exercise given in Chapter 1.

Implement an inner class InvalidDateException that extends the Exception class.
The message in the exception should read "Invalid Date!"

Include a method called String getZodiacSign() throws InvalidDateException
that returns the zodiac sign of the person if it is valid and throws an exception otherwise

*/


import java.util.Scanner;

public class GetZodiacSign {

    static class InvalidDateException extends Exception {
        public InvalidDateException() {
            super("Invalid Date!");
        }
    }

    private static String getZodiacSign(int userInput_Month, int userInput_Day) throws InvalidDateException {
        if (userInput_Month < 1 || userInput_Month > 12 || userInput_Day < 1 || userInput_Day > 31) {
            throw new InvalidDateException();
        }

        switch (userInput_Month) {
            case 1:
                return (userInput_Day >= 20) ? "Aquarius" : "Capricorn"; // January
            case 2:
                return (userInput_Day >= 19) ? "Pisces" : "Aquarius"; // February
            case 3:
                return (userInput_Day >= 21) ? "Aries" : "Pisces"; // March
            case 4:
                return (userInput_Day >= 20) ? "Taurus" : "Aries"; // April
            case 5:
                return (userInput_Day >= 21) ? "Gemini" : "Taurus"; // May
            case 6:
                return (userInput_Day >= 21) ? "Cancer" : "Gemini"; // June
            case 7:
                return (userInput_Day >= 23 && userInput_Day <= 31) ? "Leo" : "Cancer"; // July
            case 8:
                return (userInput_Day >= 23) ? "Virgo" : "Leo"; // August
            case 9:
                return (userInput_Day >= 23) ? "Libra" : "Virgo"; // September
            case 10:
                return (userInput_Day >= 23) ? "Scorpio" : "Libra"; // October
            case 11:
                return (userInput_Day >= 22) ? "Sagittarius" : "Scorpio"; // November
            case 12:
                return (userInput_Day >= 22) ? "Capricorn" : "Sagittarius"; // December
            default:
                throw new InvalidDateException();
        }
    }

    private static String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month];
    }
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter Month (1-12): ");
            int userInput_Month = scanner.nextInt();

            System.out.print("Enter the Day of the Month: ");
            int userInput_Day = scanner.nextInt();

            // Call the getZodiacSign method and handle the exception
            String zodiacSign = getZodiacSign(userInput_Month, userInput_Day);
            System.out.println("Zodiac sign for " + getMonthName(userInput_Month) + " " + userInput_Day + " is " + zodiacSign);

        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}