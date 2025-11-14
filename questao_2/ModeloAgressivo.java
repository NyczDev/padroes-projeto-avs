public class ModeloAgressivo implements EstrategiaRisco {
    public String calcularRisco(double patrimonio, double idade, double experiencia) {
        double resultado = (patrimonio * 0.7) - (idade * 0.2) + (experiencia * 0.5);
        return "Modelo Agressivo\nPatrimônio: " + patrimonio +
               "\nIdade: " + idade +
               "\nExperiência: " + experiencia +
               "\nResultado do risco: " + resultado;
    }
}
