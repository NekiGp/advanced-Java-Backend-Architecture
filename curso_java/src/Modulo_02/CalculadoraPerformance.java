package Modulo_02;

public class CalculadoraPerformance {
    public static void main(String[] args) {
        //Criando variaveis (long para os totais, double para o tempo)
        long totalRequisicoes = 500000L;
        long requisicoesComSucesso = 485000L;
        double tempoLimiteMilisegundos = 150.0;

        var taxaSucesso = (requisicoesComSucesso * 100.0) / totalRequisicoes;

        System.out.println("--- RELATÓRIO DE PERFORMANCE ---");
        System.out.println("Total de Requisições: " + totalRequisicoes);
        System.out.println("Taxa de Sucesso do Servidor: " + taxaSucesso + "%");
    }
}
