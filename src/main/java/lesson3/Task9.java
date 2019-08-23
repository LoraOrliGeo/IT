package lesson3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert A:");
        int a = sc.nextInt();

        System.out.println("Insert B:");
        int b = sc.nextInt();

        int sum = 0;

        for (int i = a; i <= b ; i++) {
            if (i % 3 == 0){
                System.out.print("skip 3,");
                continue;
            }

            if (sum > 200){
                break;
            }

            int numPowTwo = (int)Math.pow(i, 2);

            if (i == b){
                System.out.print(numPowTwo);
            } else {
                System.out.print(numPowTwo + ",");
            }

            sum += numPowTwo;
        }

        System.out.println();
        System.out.println(sum);
    }
}
