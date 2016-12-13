package ru.parsentev.task_015;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class CycleShift {
    private static final Logger log = getLogger(CycleShift.class);

    private final int[] values;

    /*public static void main(String[] args){
        CycleShift cs = new CycleShift(new int[] {1,2,3,4});
        System.out.println(Arrays.toString(cs.shift(0)));
    }*/

    public CycleShift(final int[] values) {
        this.values = values;
    }

    public int[] shift(int position) {

        //if shifting argument is equals to array's length nothing has to be shifted.
        if (values.length <= 1 || position == 0 || position % values.length == 0){
            return values;
        }
        while (position > 0) {
            int temp = values[values.length - 1];
            for (int i = values.length - 1 ; i > 0; i--){
                values[i] = values[i-1];
            }
            values[0] = temp;
            position--;
        }
        return values;
    }
}
