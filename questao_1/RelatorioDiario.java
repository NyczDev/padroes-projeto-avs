public class RelatorioDiario implements Relatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando Relatório Diário:");
        System.out.println("- Fontes de dados: Banco Operacional");
        System.out.println("- Métricas: Transações do dia");
        System.out.println("- Formato: PDF Simples");
        System.out.println();
    }
}