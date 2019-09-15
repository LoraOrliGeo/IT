package lesson10_practice;

public class Test1Task3S5 {
    public static void main(String[] args) {

        int[] arr = {-5, -3, -2, -1, 2, 3, 5, 7, 8};
        System.out.println(retrieveCountNegative(arr));
    }

    public static int retrieveCountNegative(int[] sortedArr){
        // O(N) - linear complexity?
        int count = 0;
        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] < 0){
                count++;
            }
        }
        return count;
    }
}
