package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert A:");
        int a = sc.nextInt();

        System.out.println("Insert B:");
        int b = sc.nextInt();

        List<String> output = new ArrayList<>();

        int sum = 0;

        for (int i = a; i <= b ; i++) {
            if (i % 3 == 0){
                output.add("skip 3");
                continue;
            }

            int pow = (int)Math.pow(i, 2);
            sum += pow;
            output.add(pow + "");

            if (sum > 200){
                break;
            }
        }

        System.out.println(String.join(", ", output));
    }
}
