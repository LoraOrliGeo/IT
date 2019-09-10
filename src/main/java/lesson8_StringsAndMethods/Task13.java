package lesson8_StringsAndMethods;

public class Task13 {
    public static void main(String[] args) {

        int[] arr1 = {1, 5, 3, -2, 0, 15, -9};
        int[] arr2 = {9, 13, -4, 6, 18};

        int[] arr3 = createThirdArray(arr1, arr2);
        Task11.printArray(arr3);

    }

    private static int[] createThirdArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        int index = 0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[index++];
        }

        return arr3;
    }
}
