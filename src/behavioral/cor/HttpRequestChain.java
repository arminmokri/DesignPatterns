package behavioral.cor;

import behavioral.cor.service.AuthenticationService;
import behavioral.cor.service.AuthorizationService;
import behavioral.cor.service.CheckUrlService;
import behavioral.cor.service.HttpResponseService;

public class HttpRequestChain {

    HttpRequestHandler head;

    public HttpRequestChain() {
        HttpRequestHandler h1 = new CheckUrlService();
        HttpRequestHandler h2 = new AuthenticationService();
        HttpRequestHandler h3 = new AuthorizationService();
        HttpRequestHandler h4 = new HttpResponseService();

        //
        head = h1;
        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);
    }

    public void processHttpRequest(HttpRequest httpRequest) {
        head.handle(httpRequest);
    }

}
