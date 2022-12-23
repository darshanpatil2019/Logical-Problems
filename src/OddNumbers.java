public class OddNumbers {
    public static void main(String[] args) {
        int number = 100;

        for (int i = 1; i <= number; i++)
            if (i % 2 != 0) // odd number not divisible by 2

                System.out.print(i + " ");
    }
}
