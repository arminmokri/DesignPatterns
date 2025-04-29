package behavioral.interpreter;

public class DivisionExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public DivisionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}
