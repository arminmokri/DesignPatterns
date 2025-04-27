package behavioral.cor.service;

import behavioral.cor.Main;
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
            Main.println("AuthenticationService username='" + username + "' and password='" + "****" + "' is correct.");
            this.goNext(httpRequest);
        } else { // Drop request
            Main.errPrintln("AuthenticationService username='" + username + "' and password='" + "****" + "' is not correct.");
            httpRequest.setResponseCode(401);
            throw new AccessDenied("access denied, wrong username or password.");
        }

    }
}
