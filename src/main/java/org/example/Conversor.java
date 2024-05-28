package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class Conversor {

    Gson gson= new Gson();

    public String convertir(double cantidad, String monedaOriginal, String monedaAConvertir){

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://open.er-api.com/v6/latest/"+monedaOriginal))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonRespuesta = gson.fromJson(response.body(), JsonObject.class);
            JsonObject precios =jsonRespuesta.getAsJsonObject("rates");
            double precioMoneda = precios.get(monedaAConvertir).getAsDouble();
            return String.format("%.2f",precioMoneda * cantidad);
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"Error durante la conversión, intenta de nuevo");}
        return null;
    }
}
