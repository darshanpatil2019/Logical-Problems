import java.util.Scanner;

public class FactorialProgramme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= number; i++){
            fact = fact * i; //for multiply of factorial number and value at i
        }
        System.out.println(fact);
    }
}
