package behavioral.cor.service;

import behavioral.cor.exception.AccessDenied;
import behavioral.cor.HttpRequest;
import behavioral.cor.HttpRequestHandler;
import behavioral.cor.rbac.User;

public class AuthenticationService extends HttpRequestHandler {

    @Override
    public void handle(HttpRequest httpRequest) {

        String username = httpRequest.getUsername();
        String password = httpRequest.getPassword();

        User user = User.getUser(username);
        if (user.isPasswordValid(password)) {
            System.out.println("AuthenticationService username='" + username + "' and password='" + "****" + "' is correct.");
            System.out.flush();
            this.goNext(httpRequest);
        } else { // Drop request
            System.err.println("AuthenticationService username='" + username + "' and password='" + "****" + "' is not correct.");
            System.err.flush();
            httpRequest.setResponseCode(401);
            throw new AccessDenied("access denied, wrong username or password.");
        }

    }
}
