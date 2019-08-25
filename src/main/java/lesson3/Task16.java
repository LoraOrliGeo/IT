package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> output = new ArrayList<>();

        int start = Math.max(a, b);
        int end = Math.min(a, b);

        for (int i = start; i >= end; i--) {
            if (i % 50 == 0) {
                output.add(i);
            }
        }

        System.out.println(output.toString().replaceAll("[]|\\[]", ""));
    }
}
