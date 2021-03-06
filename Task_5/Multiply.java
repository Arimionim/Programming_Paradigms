package ru.itmo.ctddev.khusainov;

/**
 * Created by Anver on 19.03.2017.
 */
public class Multiply extends AbstractBinaryOperation {
    public Multiply(MultiExpression operand1, MultiExpression operand2) {
        super(operand1, operand2);
    }

    public double makeOperation(double x, double y) {
        return x * y;
    }

    public int makeOperation(int x, int y) {
        return x * y;
    }

}
