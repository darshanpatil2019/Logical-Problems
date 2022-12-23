public class LargestElementArray {
    public static void main(String[] args) {

        int arr[] = new int[]{42, 36, 98, 782, 103, 862};// Initialize array
        int max = arr[0]; //initialize variable for comparing
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) //comparing elements
            {
                max = arr[i];
            }
        }
        System.out.println("Largest Element in Array is: " + max);
    }
}
