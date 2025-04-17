package behavioral.chain_of_responsibility.service;

import behavioral.chain_of_responsibility.exception.AccessDenied;
import behavioral.chain_of_responsibility.HttpRequest;
import behavioral.chain_of_responsibility.HttpRequestHandler;
import behavioral.chain_of_responsibility.rbac.User;

import java.util.Objects;

public class AuthenticationService extends HttpRequestHandler {

    @Override
    public void handle(HttpRequest httpRequest) {

        String username = httpRequest.getUsername();
        String password = httpRequest.getPassword();

        User user = User.getUser(username);
        if (user.isPasswordValid(password)) {
            System.out.println("AuthenticationService username='" + username + "' and password='" + password + "' is correct.");
            if (Objects.nonNull(getNext())) {
                getNext().handle(httpRequest);
            }
        } else {

            // Drop request
            System.err.println("AuthenticationService username='" + username + "' and password='" + password + "' is not correct.");
            throw new AccessDenied("access denied, wrong username or password.");
        }

    }
}
