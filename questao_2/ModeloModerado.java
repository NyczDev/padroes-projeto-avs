public class ModeloModerado implements EstrategiaRisco {
    public String calcularRisco(double patrimonio, double idade, double experiencia) {
        double resultado = (patrimonio * 0.5) - (idade * 0.3) + (experiencia * 0.3);
        return "Modelo Moderado\nPatrimônio: " + patrimonio +
               "\nIdade: " + idade +
               "\nExperiência: " + experiencia +
               "\nResultado do risco: " + resultado;
    }
}
