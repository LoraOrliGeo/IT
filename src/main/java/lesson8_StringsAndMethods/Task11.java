package lesson8_StringsAndMethods;

public class Task11 {
    public static void main(String[] args) {

        int[] array = {1, 5, -3, 16, 25, -10, 9};

        printArray(array);

    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
