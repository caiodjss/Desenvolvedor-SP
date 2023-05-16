import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class faturamento {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Carregar os dados do arquivo JSON
            File arquivoJson = new File("faturamento.json");
            JsonNode dados = objectMapper.readTree(arquivoJson);

            int[] faturamentoDiario = carregarFaturamentoDiario(dados);

            int menorFaturamento = calcularMenorFaturamento(faturamentoDiario);
            int maiorFaturamento = calcularMaiorFaturamento(faturamentoDiario);
            int diasSuperioresMedia = contarDiasSuperioresMedia(faturamentoDiario);

            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento superior à média mensal: " + diasSuperioresMedia);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] carregarFaturamentoDiario(JsonNode dados) {
        JsonNode faturamentoDiarioNode = dados.get("faturamento_diario");
        int[] faturamentoDiario = new int[faturamentoDiarioNode.size()];

        for (int i = 0; i < faturamentoDiarioNode.size(); i++) {
            faturamentoDiario[i] = faturamentoDiarioNode.get(i).asInt();
        }

        return faturamentoDiario;
    }

    public static int calcularMenorFaturamento(int[] faturamentoDiario) {
        int menor = Integer.MAX_VALUE;

        for (int faturamento : faturamentoDiario) {
            if (faturamento < menor) {
                menor = faturamento;
            }
        }

        return menor;
    }

    public static int calcularMaiorFaturamento(int[] faturamentoDiario) {
        int maior = Integer.MIN_VALUE;

        for (int faturamento : faturamentoDiario) {
            if (faturamento > maior) {
                maior = faturamento;
            }
        }

        return maior;
    }

    public static int contarDiasSuperioresMedia(int[] faturamentoDiario) {
        int soma = 0;
        int count = 0;

        for (int faturamento : faturamentoDiario) {
            soma += faturamento;
        }
    }
}