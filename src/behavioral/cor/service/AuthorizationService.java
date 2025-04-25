package behavioral.cor.service;

import behavioral.cor.*;
import behavioral.cor.exception.AccessDenied;
import behavioral.cor.rbac.Role;
import behavioral.cor.rbac.RoleUrlMapper;
import behavioral.cor.rbac.User;

public class AuthorizationService extends HttpRequestHandler {

    @Override
    public void handle(HttpRequest httpRequest) {

        String username = httpRequest.getUsername();
        String url = httpRequest.getUrl();

        User user = User.getUser(username);
        Role role = user.getRole();

        if (RoleUrlMapper.isAccessAllowed(role, url)) {
            System.out.println("AuthorizationService this username '" + username + "' with role=" + role.toString() + " has access to url='" + url + "'");
            System.out.flush();
            this.goNext(httpRequest);
        } else { // Drop request
            System.err.println("AuthorizationService this username '" + username + "' with role=" + role.toString() + " doesn't have access to url='" + url + "'");
            System.err.flush();
            httpRequest.setResponseCode(403);
            throw new AccessDenied("access denied, this user cannot access this page");
        }

    }
}
