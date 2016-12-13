package ru.parsentev.task_014;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;


import java.util.Arrays;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ReversePhrase {
    private static final Logger log = getLogger(ReversePhrase.class);
    private final String line;

    public ReversePhrase(final String line) {
        this.line = line;
    }

    /*public static void main (String[] args){
        String input = "forever and ever";
        ReversePhrase rp = new ReversePhrase(input);
        //String[] testString = {"public", "static", "void", "main"};
        String output = rp.reverse();
        System.out.println(input+" length is: "+input.length());
        System.out.println(output+" length is: "+output.length());
        ReversePhrase reversed = new ReversePhrase(output);
        System.out.println(reversed.reverse().equals(input));
    }*/

    public String reverse() {
        if (line.length() == 0) {
            return "";
        }
        if (numOfSpaces(line) == 0) {
            return line;
        }

        //splitting the string
        String[] words = line.split(" ");

        //reversing the order of elements
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        //combining the string from array
        return combine(words);
    }

    public static int numOfSpaces(String line) {
        int counter = 0;
        char[] charLine = line.toCharArray();
        for (char letter : charLine) {
            if (letter == ' ')
                counter++;
        }
        return counter;
    }

    public static String combine(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String item : words) {
            sb.append(item);
            sb.append(" ");
        }
        return sb.toString().trim();
    }


}
