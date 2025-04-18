package behavioral.chain_of_responsibility;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        HttpRequestChain httpRequestChain = new HttpRequestChain();
        HttpRequest httpRequest = null;

        try {
            httpRequest = new HttpRequest("/user", "alice", "741");
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
        System.out.flush();

        try {
            httpRequest = new HttpRequest("/admin", "alice", "123");
            httpRequestChain.processHttpRequest(httpRequest);

        } catch (RuntimeException e) {
        } finally {
            if (httpRequest.getResponseCode() == 200) {
                System.out.println(httpRequest.getResponse());
            } else {
                System.err.println("Request failed with error code: " + httpRequest.getResponseCode());
            }
        }

        Thread.sleep(3000);
        System.out.println();
        System.out.flush();

        try {
            httpRequest = new HttpRequest("/admin", "admin", "admin");
            httpRequestChain.processHttpRequest(httpRequest);
        } catch (RuntimeException e) {
        } finally {
            if (httpRequest.getResponseCode() == 200) {
                System.out.println(httpRequest.getResponse());
            } else {
                System.err.println("Request failed with error code: " + httpRequest.getResponseCode());
            }
        }

        Thread.sleep(3000);
        System.out.println();
        System.out.flush();

        try {
            httpRequest = new HttpRequest("/user", "alice", "123");
            httpRequestChain.processHttpRequest(httpRequest);
        } catch (RuntimeException e) {
        } finally {
            if (httpRequest.getResponseCode() == 200) {
                System.out.println(httpRequest.getResponse());
            } else {
                System.err.println("Request failed with error code: " + httpRequest.getResponseCode());
            }
        }

        Thread.sleep(3000);
        System.out.println();

        System.out.flush();

        try {
            httpRequest = new HttpRequest("/about_us", "alice", "123");
            httpRequestChain.processHttpRequest(httpRequest);
        } catch (RuntimeException e) {
        } finally {
            if (httpRequest.getResponseCode() == 200) {
                System.out.println(httpRequest.getResponse());
            } else {
                System.err.println("Request failed with error code: " + httpRequest.getResponseCode());
            }
        }
    }
}
