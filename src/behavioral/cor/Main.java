package behavioral.cor;

public class Main {

    public static void println(String x) {
        System.out.println(x);
        System.out.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void errPrintln(String x) {
        System.err.println(x);
        System.err.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void println() {
        println("");
    }

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
                    Main.println(httpRequest.getResponse());
                } else {
                    Main.errPrintln("Request failed with error code: " + httpRequest.getResponseCode());
                }
            }

            Thread.sleep(2000);
            println();
        }


    }
}
