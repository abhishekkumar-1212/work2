public class r {
    public static void visa(int arr[]) { // Here pass my array
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 7, 8 };
        // Now traverse whole array.First call above function
        visa(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println(" ");
    }
}