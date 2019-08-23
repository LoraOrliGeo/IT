package lesson3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n - 1; i > 0 ; i--) {
            if(i % 7 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
