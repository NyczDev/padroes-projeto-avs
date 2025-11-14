public class SistemaRelatorios {
    public void gerarEExibirRelatorio(RelatorioFactory factory) {
        Relatorio relatorio = factory.criarRelatorio();
        relatorio.gerar();
    }
}