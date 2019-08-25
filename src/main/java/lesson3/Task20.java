package lesson3;

public class Task20 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int num = i;
            StringBuilder row = new StringBuilder();

            for (int j = 1; j <= 10; j++) {
                if (num >= 10) {
                    num = 0;
                }
                row.append(num).append(" ");
                num++;
            }

            System.out.println(row);
        }
    }
}
