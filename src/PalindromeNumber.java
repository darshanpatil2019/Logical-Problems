import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");

        int number = sc.nextInt();
        // Initialize the variables
        int reverse = 0;
        int remainder;
        int temp = number;

        while (temp != 0)
        {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        if (number == reverse) {
            System.out.println("Given Number is Palindrome");
        } else {
            System.out.println("Given Number is not Palindrome");
        }
    }
}
