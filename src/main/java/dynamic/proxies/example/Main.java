package dynamic.proxies.example;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {

        final Server server = new Server(DefaultRequestHandler.class);
        server.startServer();

        final String[] requestNames = {"Kobe", "Lebron", "Jordan", "Steph", "Pierce"};

        for (String requestName : requestNames) {
            server.sendRequest(new Request(requestName));
            TimeUnit.MILLISECONDS.sleep(500);
        }

        server.setAwaitTermination(3, TimeUnit.SECONDS);
        server.shutDown();
    }
}
