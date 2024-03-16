/*

3.  Write a for loop which sums all values between 10 and 100 into a variable called total.
 Assume that total has NOT been initialized to zero.
 
 */


public class ForLoopSum {

    public static void main(String[] args) {
        int total = 10;

        for (int i = 11; i <= 100; i++) {
            total = total + i;
        }

        System.out.println("The sum of values between 10 and 20 is: " + total);
    }
}
