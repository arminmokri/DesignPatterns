package behavioral.chain_of_responsibility.service;

import behavioral.chain_of_responsibility.*;
import behavioral.chain_of_responsibility.exception.AccessDenied;
import behavioral.chain_of_responsibility.rbac.Role;
import behavioral.chain_of_responsibility.rbac.RoleUrlMapper;
import behavioral.chain_of_responsibility.rbac.User;

import java.util.Objects;

public class AuthorizationService extends HttpRequestHandler {

    @Override
    public void handle(HttpRequest httpRequest) {

        String username = httpRequest.getUsername();
        String url = httpRequest.getUrl();

        User user = User.getUser(username);
        Role role = user.getRole();

        if (RoleUrlMapper.isAccessAllowed(role, url)) {
            System.out.println("AuthorizationService this username '" + username + "' with role=" + role.toString() + " has access to url='" + url + "'");
            if (Objects.nonNull(getNext())) {
                getNext().handle(httpRequest);
            }
        } else {
            // Drop request
            System.err.println("AuthorizationService this username '" + username + "' with role=" + role.toString() + " doesn't have access to url='" + url + "'");
            throw new AccessDenied("access denied, this user cannot access this page");
        }

    }
}
