package strategy.estrategias;

public class ModeloModerado implements CalculoPerfilRisco {
    @Override
    public double calcularPerfil(double investimento, double tolerancia) {
        double risco = (investimento * 0.5) + (tolerancia * 0.5);
        System.out.println("Modelo Moderado aplicado:");
        System.out.println("- Fórmula: (investimento * 0.5) + (tolerancia * 0.5)");
        System.out.println("- Resultado: " + risco);
        return risco;
    }
}