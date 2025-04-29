package behavioral.interpreter;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationExpression implements Expression {
    private final ArrayList<Expression> expressions;

    public MultiplicationExpression(Expression... expressions) {
        this.expressions = new ArrayList<>(Arrays.asList(expressions));
    }

    public MultiplicationExpression(Expression left, Expression right) {
        this(new Expression[]{left, right});
    }

    @Override
    public int interpret() {
        return expressions.stream().map(Expression::interpret).mapToInt(Integer::intValue).reduce(1, (a, b) -> a * b);
    }
}
