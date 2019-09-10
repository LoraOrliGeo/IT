package lesson8_StringsAndMethods;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = sc.nextLine().split(", ");

        int maxNameSum = 0;
        String maxName = "";

        for (String name : names) {
            int nameSum = 0;
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) != ' ') {
                    nameSum += name.charAt(i);
                }
            }

            if (nameSum >= maxNameSum){
                maxNameSum = nameSum;
                maxName = name;
            }
        }

        System.out.println(maxName);
    }
}
