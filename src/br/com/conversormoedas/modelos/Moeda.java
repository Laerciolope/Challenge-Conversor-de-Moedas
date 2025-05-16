package br.com.conversormoedas.modelos;

public record Moeda (String conversion_result, String base_code, String target_code ){

    @Override
    public String toString() {
        return "{ conversao de "+base_code+" para "+target_code+" Corresponde ao valor " + conversion_result +
                "}";
    }
}
