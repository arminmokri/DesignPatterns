package behavioral.chain_of_responsibility.exception;

public class PageNotFound extends RuntimeException {

    public PageNotFound(String message) {
        super(message);
    }

}
