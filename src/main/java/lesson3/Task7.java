package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a number:");
        int n = sc.nextInt();
        int start = 3;

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            numbers.add(start);
            start += 3;
        }

        System.out.println(String.join(", ", numbers.toString().replaceAll("[\\[\\]]", "")));
    }
}
