package ru.parsentev.task_005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * Class is used to create a right triangle.
 *
 * @author a-telegin
 * @since 04.12.2016
 */
public class RightTriangle extends Triangle {
    private static final Logger log = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        boolean result = false;
        if (super.exists() &&
                (isPithagorean(sideA, sideB, sideC) ||
                 isPithagorean(sideB, sideC, sideA) ||
                 isPithagorean(sideC, sideA, sideB))){
            result = true;
        }
        return result;
    }

    /**
     * Checks whether three of the input sides of a triangle comply with the Pithagorean rule:
     * a<sup>2</sup> = b <sup>2</sup> + c <sup>2</sup>
     */
    protected boolean isPithagorean(double hypothenuse, double cathetusOne, double cathetusTwo){
        boolean result = false;
        //assume that 0.00001 precision is enough for our case
        final double PRECISION = 0.00001;
        if (Math.abs(hypothenuse * hypothenuse -
                cathetusOne * cathetusOne -
                cathetusTwo * cathetusTwo) <= PRECISION){
            result = true;
        }
        return result;
    }
}
