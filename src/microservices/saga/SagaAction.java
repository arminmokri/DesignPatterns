package microservices.saga;

public interface SagaAction {
    void execute() throws RuntimeException;

    void compensate() throws RuntimeException;
}
