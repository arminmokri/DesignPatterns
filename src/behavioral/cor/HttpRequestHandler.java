package behavioral.cor;

import java.util.Objects;

public abstract class HttpRequestHandler {

    private HttpRequestHandler next;

    public void setNext(HttpRequestHandler httpRequestHandler) {
        this.next = httpRequestHandler;

    }

    public HttpRequestHandler getNext() {
        return next;
    }

    public void goNext(HttpRequest httpRequest) {
        if (Objects.nonNull(getNext())) {
            getNext().handle(httpRequest);
        }
    }

    public abstract void handle(HttpRequest httpRequest);
}
