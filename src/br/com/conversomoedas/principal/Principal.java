package br.com.conversomoedas.principal;

import br.com.conversormoedas.modelos.ConversorMoeda;
import br.com.conversormoedas.modelos.Moeda;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        var novaConversao = new ConversorMoeda();
        int menu = 0;

        while (menu != 7) {

            System.out.println("*************************************");
            System.out.println("Seja Bem-Vindo / Conversor de Moedas ");
            System.out.println("1 ) Dólar  ==> Peso Argentino");
            System.out.println("2 ) Peso Argentino  ==> Dólar");
            System.out.println("3 ) Dólar  ==> Real Brasileiro");
            System.out.println("4 ) Real Brasileiro  ==> Dólar");
            System.out.println("5 ) Dólar  ==> Peso Colombiano");
            System.out.println("6 ) Peso Colombiano  ==> Dólar");
            System.out.println("7 ) Sair");
            System.out.println("************************************");
            System.out.println("Escolha uma opção válida:");

            try {
                menu = Integer.parseInt(leitura.nextLine());

                if (menu < 1 || menu > 7) {
                    System.out.println("Opção inválida. Tente novamente.");
                } else if (menu >= 1 && menu <= 6) {
                    System.out.println("Digite o valor que deseja converte:");
                    double valor = Double.parseDouble(leitura.nextLine());

                    Moeda novaMoeda = novaConversao.converterMoeda(valor, menu);
                    System.out.println(novaMoeda);
                } else {
                    System.out.println("Encerrando aplicação...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, insira um número válido.");
            } catch (RuntimeException e) {
                System.out.println("erro de conversao ,verifique sua internet  ");
            }
        }

        leitura.close();
    }
}