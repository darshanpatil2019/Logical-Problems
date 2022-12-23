public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1, c; //Instance Variables
        System.out.print(a + " " + b);

        for (int i = 1; i <= 10; i++)
        {
            c = a + b; //3r number is addition off first two numbers
            System.out.print(" " + c);
            a = b; //swap element
            b = c;
        }
    }
}
