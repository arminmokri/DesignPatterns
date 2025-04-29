package behavioral.interpreter;

public class Main {

    public static void println(String x) {
        System.out.println(x);
        System.out.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void errPrintln(String x) {
        System.err.println(x);
        System.err.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void println() {
        println("");
    }

    public static void main(String[] args) throws InterruptedException {

        // Represent: (2) * (5 + 10 + 15) - (2 + 1)

        Expression firstExpression = new NumberExpression(2);

        Expression secondExpression = new AdditionExpression(
                new NumberExpression(5),
                new NumberExpression(10),
                new NumberExpression(15)
        );

        Expression resFirstSecondExpression = new MultiplicationExpression(
                firstExpression,
                secondExpression
        );

        Expression thirdExpression = new AdditionExpression(
                new NumberExpression(2),
                new NumberExpression(1)
        );

        Expression finalExpression1 = new SubtractionExpression(resFirstSecondExpression, thirdExpression);

        println("(2) * (5 + 10 + 15) - (2 + 1)=" + finalExpression1.interpret());
        println();
        Thread.sleep(2000);

        Expression finalExpression2 = new DivisionExpression(secondExpression, thirdExpression);

        println("(5 + 10 + 15) / (2 + 1)=" + finalExpression2.interpret());
        println();
        Thread.sleep(2000);

    }
}

