public class AnaliseRisco {
    private EstrategiaRisco estrategia;

    public void setEstrategia(EstrategiaRisco estrategia) {
        this.estrategia = estrategia;
    }

    public String executarCalculo(double patrimonio, double idade, double experiencia) {
        return estrategia.calcularRisco(patrimonio, idade, experiencia);
    }
}
