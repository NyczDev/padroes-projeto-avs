public class ModeloConservador implements EstrategiaRisco {
    public String calcularRisco(double patrimonio, double idade, double experiencia) {
        double resultado = (patrimonio * 0.3) - (idade * 0.4) + (experiencia * 0.1);
        return "Modelo Conservador\nPatrimônio: " + patrimonio +
               "\nIdade: " + idade +
               "\nExperiência: " + experiencia +
               "\nResultado do risco: " + resultado;
    }
}
