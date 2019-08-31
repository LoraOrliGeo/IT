package lesson5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = Arrays.stream(sc.nextLine().split("; ")).mapToDouble(Double::parseDouble).toArray();

        double firstMax = 0, secondMax = 0, thirdMax = 0;

        for (int i = 0; i < numbers.length; i++) {
            double curr;

            if (numbers[i] < 0){
                curr = numbers[i] * -1;
            } else {
                curr = numbers[i];
            }

            if (curr > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = curr;
            } else if (curr > secondMax){
                thirdMax = secondMax;
                secondMax = curr;
            } else if (curr > thirdMax){
                thirdMax = curr;
            }
        }

        System.out.println(thirdMax + "; " + secondMax + "; " + firstMax);
    }
}
