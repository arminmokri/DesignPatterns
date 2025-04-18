package behavioral.chain_of_responsibility.service;

import behavioral.chain_of_responsibility.HttpRequest;
import behavioral.chain_of_responsibility.HttpRequestHandler;
import behavioral.chain_of_responsibility.exception.AccessDenied;
import behavioral.chain_of_responsibility.exception.PageNotFound;
import behavioral.chain_of_responsibility.rbac.Role;
import behavioral.chain_of_responsibility.rbac.RoleUrlMapper;
import behavioral.chain_of_responsibility.rbac.User;

public class CheckUrlService extends HttpRequestHandler {

    @Override
    public void handle(HttpRequest httpRequest) {

        String url = httpRequest.getUrl();

        if (RoleUrlMapper.isUrlValid(url)) {
            System.out.println("CheckUrlService url='" + url + "' resolved");
            System.out.flush();
            this.goNext(httpRequest);
        } else { // Drop request
            System.err.println("CheckUrlService url='" + url + "' not resolved");
            System.err.flush();
            httpRequest.setResponseCode(404);
            throw new PageNotFound("Unable to resolve url='" + url + "'");
        }

    }

}
