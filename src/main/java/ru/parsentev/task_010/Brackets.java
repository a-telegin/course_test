package ru.parsentev.task_010;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Brackets {
    private static final Logger log = getLogger(Brackets.class);
    private final String line;

    public Brackets(final String line) {
        this.line = line;
    }

    public boolean isCorrect() {
        final char OPEN_PAR = '(';
        final char CLOSE_PAR = ')';
        int counter = 0;

        for (int i = 0; i < line.length() ; i++) {
            if (line.charAt(i) == OPEN_PAR){
                counter++;
            }
            else if (line.charAt(i) == CLOSE_PAR){
                if (counter == 0){
                    counter = -1;
                    break;
                }
                else counter--;
            }
        }

        return (counter == 0);
    }
}
