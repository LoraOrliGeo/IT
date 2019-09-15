package lesson10_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Test1Task2S6 {
    public static void main(String[] args) {

        /*
        write a function that takes a String variable that hold some text
        the program must output the length of the longest sentence in a text
        and the number of sentences
        it's given that each sentence starts with a capital letter and
        there are not other capital letter word in each sentence

        Ex: Today is a good day for test. Sun is shining. The students are happy.
        The birds are blue.

        29 (Today is a good day for test.)
        4 sentences in text
         */

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(getLengthLongestSentence(text)[0]);
        System.out.println(getLengthLongestSentence(text)[1]);
    }

    public static int[] getLengthLongestSentence(String text){
        int[] output = new int[2];
        String[] sentences = text.split("[A-Z]");
        int maxLength = sentences[0].length();
        for (int i = 0; i < sentences.length; i++) {
            int currLength = sentences[i].length();

            if (currLength > maxLength){
                maxLength = currLength;
            }
        }
        output[0] = maxLength;
        output[1] = sentences.length - 1;
        return output;
    }
}
