package module_three.files.comma_counter;

import java.io.FileReader;

public class Counter extends Thread {
    private String text;
    private char symbol;
    private int currentCount;

    public Counter(String text, char symbol) {
        this.text = text;
        this.symbol = symbol;
    }

    @Override
    public void run() {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                currentCount++;
            }
        }
    }

    public int getCurrentCount() {
        return currentCount;
    }
}
