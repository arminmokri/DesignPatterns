package behavioral.cor.service;

import behavioral.cor.HttpRequest;
import behavioral.cor.HttpRequestHandler;
import behavioral.cor.Main;
import behavioral.cor.exception.PageNotFound;
import behavioral.cor.rbac.RoleUrlMapper;

public class CheckUrlService extends HttpRequestHandler {

    @Override
    public void handle(HttpRequest httpRequest) {

        String url = httpRequest.getUrl();

        if (RoleUrlMapper.isUrlValid(url)) {
            Main.println("CheckUrlService url='" + url + "' resolved");
            this.goNext(httpRequest);
        } else { // Drop request
            Main.errPrintln("CheckUrlService url='" + url + "' not resolved");
            httpRequest.setResponseCode(404);
            throw new PageNotFound("Unable to resolve url='" + url + "'");
        }

    }

}
