package behavioral.cor.service;

import behavioral.cor.HttpRequest;
import behavioral.cor.HttpRequestHandler;
import behavioral.cor.exception.PageNotFound;
import behavioral.cor.rbac.RoleUrlMapper;

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
