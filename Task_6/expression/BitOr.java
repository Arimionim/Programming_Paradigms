package ru.itmo.ctddev.khusainov.expression;

/**
 * Created by user on 29.03.2017.
 */
public class BitOr  extends AbstractBinaryOperation {

    public BitOr(TripleExpression operand1, TripleExpression operand2) {
        super(operand1, operand2);
    }

    public int makeOperation(int x, int y) {
        return x | y;
    }
}
