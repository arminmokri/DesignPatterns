package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.service.AuthenticationService;
import behavioral.chain_of_responsibility.service.AuthorizationService;
import behavioral.chain_of_responsibility.service.HttpResponseService;

public class HttpRequestChain {

    HttpRequestHandler head;

    public HttpRequestChain() {
        HttpRequestHandler h1 = new AuthenticationService();
        HttpRequestHandler h2 = new AuthorizationService();
        HttpRequestHandler h3 = new HttpResponseService();

        //
        head = h1;
        h1.setNext(h2);
        h2.setNext(h3);
    }

    public void processHttpRequest(HttpRequest httpRequest) {
        head.handle(httpRequest);
    }

}
