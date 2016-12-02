package ru.parsentev.task_003;

import org.junit.Ignore;
import org.junit.Test;
import ru.parsentev.task_002.Point;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
//@Ignore
public class TriangleTest {
    @Test
    public void calculateArea() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        double result = new Triangle(first, second, third).area();
        assertThat(result, is(2d));

        double resultTwo = new Triangle(new Point(0,1), new Point(0,0), new Point(5, 0)).area();
        assertThat(resultTwo, is(2.5d));
    }

    @Test
     public void checkExists() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        boolean result = new Triangle(first, second, third).exists();
        assertThat(result, is(true));
    }

    @Test
    public void notExist() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        boolean result = new Triangle(first, second, third).exists();
        assertThat(result, is(false));
    }

    @Test(expected = IllegalStateException.class)
    public void inLine() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        new Triangle(first, second, third).area();
    }

    @Test(expected = IllegalStateException.class)
    public void inPoint() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        Point third = new Point(0, 0);
        new Triangle(first, second, third).area();
    }

}