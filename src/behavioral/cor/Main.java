package behavioral.cor;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        HttpRequestChain httpRequestChain = new HttpRequestChain();
        HttpRequest[] httpRequests = {
                new HttpRequest("/about_us", "alice", "123"), // fail in CheckUrlService, wrong url
                new HttpRequest("/user", "alice", "741"), // fail in AuthenticationService, wrong username or password
                new HttpRequest("/admin", "alice", "123"), // fail in AuthorizationService, wrong role
                new HttpRequest("/admin", "admin", "admin"), // ok
                new HttpRequest("/user", "alice", "123"), // ok
        };

        for (HttpRequest httpRequest : httpRequests) {
            try {
                httpRequestChain.processHttpRequest(httpRequest);
            } catch (RuntimeException e) {
            } finally {
                if (httpRequest.getResponseCode() == 200) {
                    System.out.println(httpRequest.getResponse());
                    System.out.flush();
                } else {
                    System.err.println("Request failed with error code: " + httpRequest.getResponseCode());
                    System.err.flush();
                }
            }

            Thread.sleep(3000);
            System.out.println();
        }


    }
}
