package behavioral.interpreter;

import java.util.ArrayList;
import java.util.Arrays;

public class AdditionExpression implements Expression {
    private final ArrayList<Expression> expressions;

    public AdditionExpression(Expression... expressions) {
        this.expressions = new ArrayList<>(Arrays.asList(expressions));
    }

    public AdditionExpression(Expression left, Expression right) {
        this(new Expression[]{left, right});
    }

    @Override
    public int interpret() {
        return expressions.stream().map(Expression::interpret).mapToInt(Integer::intValue).sum();
    }
}
