public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[]{4, 98, 9, 80, 33, 78, 40}; //Take a Array
        int temp = 0; //temporary variable for swapping

        System.out.println("Elements of Original Array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        for (int i = 0; i < array.length; i++) //loop for first element
        {
            for (int j = i + 1; j < array.length; j++) //loop for next element
            {
                if (array[i] > array[j]) //To swap if element compared is greater than other element
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of Sorted Array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
