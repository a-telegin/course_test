package ru.parsentev.task_011;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Class has a method containsOnlyOnes() which checks if all the elements of 1-D array values are ones.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ArrayContainsOne {
    private static final Logger log = getLogger(ArrayContainsOne.class);
    private final int[] values;

    public ArrayContainsOne(final int[] values) {
        this.values = values;
    }

    public boolean containsOnlyOne() {
        boolean onlyOnes = true;
        if (values.length == 0) {
            return false;
        }
        for (int element : values) {
            if (element != 1) {
                onlyOnes = false;
                break;
            }
        }
        return onlyOnes;
    }
}
