public class Main {
    public static void main(String[] args) {
        AnaliseRisco analise = new AnaliseRisco();

        analise.setEstrategia(new ModeloAgressivo());
        System.out.println(analise.executarCalculo(100000, 40, 10));

        System.out.println();

        analise.setEstrategia(new ModeloModerado());
        System.out.println(analise.executarCalculo(100000, 40, 10));

        System.out.println();

        analise.setEstrategia(new ModeloConservador());
        System.out.println(analise.executarCalculo(100000, 40, 10));
    }
}
