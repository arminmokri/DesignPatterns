package behavioral.chain_of_responsibility;

public abstract class HttpRequestHandler {

    private HttpRequestHandler next;

    public void setNext(HttpRequestHandler httpRequestHandler) {
        this.next = httpRequestHandler;

    }

    public HttpRequestHandler getNext() {
        return next;
    }

    public abstract void handle(HttpRequest httpRequest);
}
