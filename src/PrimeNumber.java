import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");

        int prime = s.nextInt();
        int numcount = 0; //local variable for count of divisor
        for (int i = 1; i <= prime; i++) {
            if (prime % i == 0) ;
            numcount++;
        }
        //In prime Number , count of divisor is always 2
        if (numcount == 2) {
            System.out.println("It is A Prime Number");
        } else {
            System.out.println("It is not a Prime Number");
        }
    }
}

