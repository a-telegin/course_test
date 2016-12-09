package ru.parsentev.task_009;
import java.util.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class UniqueChars {
    private final String line;

    public UniqueChars(final String line) {
        this.line = line;
    }

    public int unique() {
        List<Character> charList = new ArrayList<Character>();
        char[] lineArray = line.toCharArray();
        for (int i = 0; i < lineArray.length; i++) {
            if (!charList.contains(lineArray[i])){
                charList.add(lineArray[i]);
            }
        }
        return charList.size();
    }
}
