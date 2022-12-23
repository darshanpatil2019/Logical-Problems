public class SmallestElementArray {
    public static void main(String[] args) {

        int arr[] = new int[]{4, 25, 36, 98, 75, 24};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                arr[i] = min;
            }
        }
        System.out.println("The Smaller number in Array is: " + min);
    }
}
