public class Main {
    public static void main(String[] args) {
        SistemaRelatorios sistema = new SistemaRelatorios();

        sistema.gerarEExibirRelatorio(new RelatorioDiarioFactory());

        sistema.gerarEExibirRelatorio(new RelatorioSemanalFactory());
    }
}