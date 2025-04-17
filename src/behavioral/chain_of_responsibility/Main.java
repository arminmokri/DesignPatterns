package behavioral.chain_of_responsibility;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        HttpRequestChain httpRequestChain = new HttpRequestChain();

        try {
            HttpRequest httpRequest = new HttpRequest("/user", "alice", "741");
            httpRequestChain.processHttpRequest(httpRequest);
            System.out.println(httpRequest.getResponse());
        } catch (RuntimeException e) {
        }

        System.out.println();
        System.out.flush();
        Thread.sleep(1000);

        try {
            HttpRequest httpRequest = new HttpRequest("/admin", "alice", "123");
            httpRequestChain.processHttpRequest(httpRequest);
            System.out.println(httpRequest.getResponse());
        } catch (RuntimeException e) {
        }

        System.out.println();
        System.out.flush();
        Thread.sleep(1000);

        try {
            HttpRequest httpRequest = new HttpRequest("/admin", "admin", "admin");
            httpRequestChain.processHttpRequest(httpRequest);
            System.out.println(httpRequest.getResponse());
        } catch (RuntimeException e) {
        }

        System.out.println();
        System.out.flush();
        Thread.sleep(1000);

        try {
            HttpRequest httpRequest = new HttpRequest("/user", "alice", "123");
            httpRequestChain.processHttpRequest(httpRequest);
            System.out.println(httpRequest.getResponse());
        } catch (RuntimeException e) {
        }
    }
}
