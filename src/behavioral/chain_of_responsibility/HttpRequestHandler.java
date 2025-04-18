package behavioral.chain_of_responsibility;

import java.util.Objects;

public abstract class HttpRequestHandler {

    private HttpRequestHandler next;

    public void setNext(HttpRequestHandler httpRequestHandler) {
        this.next = httpRequestHandler;

    }

    public void goNext(HttpRequest httpRequest) {
        if (Objects.nonNull(getNext())) {
            getNext().handle(httpRequest);
        }
    }

    public HttpRequestHandler getNext() {
        return next;
    }

    public abstract void handle(HttpRequest httpRequest);
}
