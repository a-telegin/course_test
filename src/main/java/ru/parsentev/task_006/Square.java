package ru.parsentev.task_006;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Class is used to create a square by four points.
 *
 * @author a-telegin
 * @since 04.12.2016
 */
public class Square {
    private static final Logger log = getLogger(Square.class);

    private final Point first;
    private final Point second;
    private final Point third;
    private final Point fourth;

    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double sideD;

    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;

        this.sideA = setSide(first, second);
        this.sideB = setSide(second, third);
        this.sideC = setSide(third, fourth);
        this.sideD = setSide(first, fourth);
    }

    public double setSide(final Point pointFrom, final Point pointTo){
        return pointFrom.distanceTo(pointTo);
    }

    public boolean exists() {
        boolean result = false;
        if ((sideA * sideB * sideC * sideD != 0) &&
                (sideA == sideB) &&
                (sideC == sideD) &&
                (sideA == sideC)){
            result = true;
        }
        return result;
    }
}
