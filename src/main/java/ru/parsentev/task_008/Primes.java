package ru.parsentev.task_008;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.ArrayList;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Primes {
    private static final Logger log = getLogger(Primes.class);

    private final int limit;

    public Primes(final int limit) {
        this.limit = limit;
    }

    public List<Integer> calc() {
        List<Integer> numList = new ArrayList<Integer>();
        int i = 1;
        while(i <= limit){
            if (isPrime(i , 2)){
                numList.add(i);
            }
            i++;
            continue;
        }
        return numList;
    }

    public boolean isPrime(int number, int divisor){
        if (number == 1 || number == 2 || number == 3){
            return true;
        }
        else if (number % divisor == 0){
            return false;
        }
        else if (divisor < number / 2) {
            return isPrime(number , divisor + 1);
        }
        else return true;
    }
}
