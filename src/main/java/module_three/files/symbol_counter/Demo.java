package module_three.files.symbol_counter;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

        List<String> parts = partition(allString, 2);

        for (int i = 0; i < parts.size(); i++) {
            Counter c = new Counter(parts.get(i), ',');
            c.start();
            try {
                c.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            commaCount += c.getCurrentCount();
        }

        System.out.println(LocalDateTime.now());
        System.out.println("Number of commas: " + commaCount);
    }

    private static List<String> partition(String text, int numberOfPartitions) {
        int part = text.length() / numberOfPartitions;
        List<String> parts = new ArrayList<>();
        int start = 0;
        int end = part;
        for (int i = 0; i < numberOfPartitions; i++) {
            parts.add(text.substring(start, end));
            start += part;
            end += part;
        }
        return parts;
    }
}
