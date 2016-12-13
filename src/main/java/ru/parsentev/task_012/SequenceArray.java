package ru.parsentev.task_012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SequenceArray {
    private static final Logger log = getLogger(SequenceArray.class);

    private final int[] values;

    public SequenceArray(final int[] values) {
        this.values = values;
    }

    public boolean containsOneSequence() {
        final int SEQUENCE_LENGTH = 3;
        boolean foundSequence = false;
        if (values.length == 0){
            return false;
        }

        int onesCounter = 0;

        for (int i = 0; i < values.length; i++){
            if (values[i] == 0) {
                onesCounter = 0;
            }
            else {
                onesCounter++;
                if (onesCounter >= SEQUENCE_LENGTH){
                    foundSequence = true;
                    break;
                }
            }
        }
        return foundSequence;
    }
}
