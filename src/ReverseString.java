import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");

        String s = sc.next();

        //Variable initialize
        String reverse = "";
        for (int i = s.length() -1; i >= 0 ; i--)//(s.length-1) for reverse the string
        {
            reverse = reverse + s.charAt(i);
        }

        System.out.println(reverse);
    }
}

