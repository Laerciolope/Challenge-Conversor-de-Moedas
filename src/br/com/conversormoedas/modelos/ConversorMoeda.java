package br.com.conversormoedas.modelos;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import static java.net.http.HttpClient.newHttpClient;

public class ConversorMoeda {

    private static final String CHAVE_API = "6d6465c120f4295bae982725";
    private static final Map<Integer, String[]> MOEDAS = Map.of(
            1, new String[]{"USD", "ARS"},
            2, new String[]{"ARS", "USD"},
            3, new String[]{"USD", "BRL"},
            4, new String[]{"BRL", "USD"},
            5, new String[]{"USD", "COP"},
            6, new String[]{"COP", "USD"}
    );

    public Moeda converterMoeda(double valor, int menu) {
        String[] moedas = MOEDAS.get(menu);
        if (moedas == null) {
            throw new IllegalArgumentException("Opção inválida de conversão.");
        }

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + CHAVE_API + "/pair/" + moedas[0] + "/" + moedas[1] + "/" + valor);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moeda.class);

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar a conversão: " + e.getMessage());
        }
    }
}