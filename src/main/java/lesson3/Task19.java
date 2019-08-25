package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int prev = sc.nextInt();

        List<Integer> numberSequence = new ArrayList<>();

        while (prev != 1) {
            if (isEven(prev)) {
                prev = (int) (0.5 * prev);
            } else {
                prev = 3 * prev + 1;
            }
            numberSequence.add(prev);
        }

        System.out.println(numberSequence.toString().replaceAll("[]\\[,]", ""));
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
