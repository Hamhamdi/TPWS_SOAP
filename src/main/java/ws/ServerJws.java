package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJws {
    public static void main(String[] args) {
        String url = "http://localhost:8787/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service deployed in " + url);
    }
}
