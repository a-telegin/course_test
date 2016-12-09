package ru.parsentev.task_007;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Expression {
    private static final Logger log = getLogger(Expression.class);

    private final String expr;

    public Expression(final String expr) {
        this.expr = expr;
    }


    public double calc() {
        double result = 0;
        int operandOne;
        int operandTwo;
        char operation;

        try{
            operandOne = Integer.valueOf(expr.substring(0,1));
            if ((expr.length() == 5) && expr.substring(1).equals("exp")){
                operation = '^';
                operandTwo = Integer.valueOf(expr.substring(4));
            }else{
                operation = expr.charAt(1);
                operandTwo = Integer.valueOf(expr.substring(2));
            }
        } catch (RuntimeException e){
            throw new IllegalStateException();
        }


        switch (operation){
            case '+': {result = operandOne + operandTwo; break;}
            case '-': {result = operandOne - operandTwo; break;}
            case '/': {result = operandOne / operandTwo; break;}
            case '*': {result = operandOne * operandTwo; break;}
            case '^': {result = Math.pow((double)operandOne, (double)operandTwo); break;}
            default:  throw new IllegalStateException();
        }
        return result;
    }
}
