package behavioral.cor.service;

import behavioral.cor.HttpRequest;
import behavioral.cor.HttpRequestHandler;

import java.util.Objects;

public class HttpResponseService extends HttpRequestHandler {

    String pageAdmin = "This is Admin page.";
    String pageUser = "This is User page.";
    String pageDashboard = "This is Dashboard page.";
    String pageProfile = "This is Profile page.";

    @Override
    public void handle(HttpRequest httpRequest) {

        String url = httpRequest.getUrl();

        String response = switch (url) {
            case "/admin" -> pageAdmin;
            case "/user" -> pageUser;
            case "/dashboard" -> pageDashboard;
            case "/profile" -> pageProfile;
            default -> null;
        };

        if (Objects.nonNull(response)) {
            System.out.println("HttpResponseService is ok.");
            System.out.flush();
            httpRequest.setResponseCode(200);
            httpRequest.setResponse(response);
            this.goNext(httpRequest);
        }
    }
}
