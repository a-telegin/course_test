package ru.parsentev.task_012;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
//@Ignore
public class SequenceArrayTest {
    @Test
    public void contains() {
        SequenceArray array = new SequenceArray(new int[] {0, 1, 1, 1, 0});
        boolean result = array.containsOneSequence();
        assertThat(result, is(true));
    }

    @Test
    public void notContains() {
        SequenceArray array = new SequenceArray(new int[] {0, 1, 0, 1, 0});
        boolean result = array.containsOneSequence();
        assertThat(result, is(false));
    }

    @Test
    //tests whether a method (being tested) uses adding array's indexes to find a sequence, which might get a wrong result
    public void zeroFirstFifth() {
        SequenceArray array = new SequenceArray(new int[] {1, 1, 0, 0, 0, 1});
        boolean result = array.containsOneSequence();
        assertThat(result, is(false));
    }

    @Test
    public void ifEmpty() {
        SequenceArray array = new SequenceArray(new int[] {});
        boolean result = array.containsOneSequence();
        assertThat(result, is(false));
    }
}