package GestionContact;

import javax.xml.ws.Endpoint;

public class GestionContactPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8188/GestionContact"; // L'URL du service web

        Endpoint.publish(url,  new GestionContactServiceImpl()); // Publier le service web à l'URL spécifiée
        System.out.println("Service is running. Service is deployed with success.");
    }
}