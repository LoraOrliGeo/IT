package module_three.files.symbol_counter;

import java.io.*;
import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {

        // count the number of commas in Lev Tolstoi's novel "War and Peace"

        File novel = new File("C:\\Users\\Lori\\Desktop\\voina_i_mir.txt");
        StringBuilder all = new StringBuilder();
        int commaCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(novel))) {
            String line;
            while ((line = reader.readLine()) != null) {
                all.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String allString = all.toString();
        System.out.println(LocalDateTime.now());
        Counter c1 = new Counter(allString.substring(0, allString.length() / 3), ',');
        Counter c2 = new Counter(allString.substring(allString.length() / 3, allString.length() * 2 / 3), ',');
        c1.start();
        c2.start();

        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        commaCount += c1.getCurrentCount();
        commaCount += c2.getCurrentCount();
        System.out.println(LocalDateTime.now());
        System.out.println("Number of commas: " + commaCount);
    }
}
