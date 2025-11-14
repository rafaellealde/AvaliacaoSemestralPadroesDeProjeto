package strategy.estrategias;

public class ModeloConservador implements CalculoPerfilRisco {
    @Override
    public double calcularPerfil(double investimento, double tolerancia) {
        double risco = (investimento * 0.2) + (tolerancia * 0.8);
        System.out.println("Modelo Conservador aplicado:");
        System.out.println("- Fórmula: (investimento * 0.2) + (tolerancia * 0.8)");
        System.out.println("- Resultado: " + risco);
        return risco;
    }
}