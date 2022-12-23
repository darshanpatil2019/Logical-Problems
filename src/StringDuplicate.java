public class StringDuplicate {
    public static void main(String[] args) {

        String string = new String("AUTOMATION");
        char str[] = string.toCharArray();

        for (int i = 0; i < string.length(); i++)// loop for first element
        {
            for (int j = i + 1; j < string.length(); j++) //loop for second element
            {
                if (str[i] == str[j]) {
                    System.out.println("Duplicate characters in String are: " + str[j]);
                }
            }
        }
    }
}

