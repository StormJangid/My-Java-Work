public class RevArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int l = arr.length;
        System.out.print("Original Array is : ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        // Method with only one array:
        for (int i = 0; i < (l / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        // Method with two arrays:
        // int[] arr2 = new int[l];
        // for (int i = 0; i < arr.length; i++) {
        // arr2[l - 1] = arr[i];
        // l--;
        // }
        // for (int element : arr2) {
        // System.out.print(element);
        // }
        System.out.print("Reversed Array is : ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }
}
