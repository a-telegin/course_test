package ru.parsentev.task_003;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    protected final double sideA;
    protected final double sideB;
    protected final double sideC;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.sideA = setSide(first, second);
        this.sideB = setSide(second, third);
        this.sideC = setSide(first, third);
    }

    public double setSide(final Point pointFrom, final Point pointTo){
        return pointFrom.distanceTo(pointTo);
    }

    public boolean exists() {
        boolean result = false;
        if (((sideA + sideB) > sideC) &&
                ((sideB + sideC) > sideA) &&
                ((sideA + sideC) > sideB)) {
            result = true;
        }
        return result;
    }

    public double area() {
        double result = 0;
        if (exists()){
            //Heron's formula
            double p = (sideA + sideB + sideC) / 2;
            double areaD = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

            //turning double into BigDecimal to round it properly
            BigDecimal areaBD = new BigDecimal(areaD, new MathContext(2));

            //getting area back to double
            result = areaBD.doubleValue();
        }else{
            throw new IllegalStateException();
        }
        return result;
    }
}
