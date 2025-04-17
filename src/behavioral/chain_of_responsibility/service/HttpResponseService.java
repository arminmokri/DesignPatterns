package behavioral.chain_of_responsibility.service;

import behavioral.chain_of_responsibility.HttpRequest;
import behavioral.chain_of_responsibility.HttpRequestHandler;
import behavioral.chain_of_responsibility.exception.PageNotFound;

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
            default -> throw new PageNotFound("Unable to resolve url='" + url + "'");
        };

        httpRequest.setResponse(response);

        if (Objects.nonNull(getNext())) {
            getNext().handle(httpRequest);
        }
    }
}
