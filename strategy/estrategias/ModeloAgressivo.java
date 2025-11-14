package strategy.estrategias;

public class ModeloAgressivo implements CalculoPerfilRisco {
    @Override
    public double calcularPerfil(double investimento, double tolerancia) {
        double risco = (investimento * 0.8) + (tolerancia * 0.2);
        System.out.println("Modelo Agressivo aplicado:");
        System.out.println("- Fórmula: (investimento * 0.8) + (tolerancia * 0.2)");
        System.out.println("- Resultado: " + risco);
        return risco;
    }
}