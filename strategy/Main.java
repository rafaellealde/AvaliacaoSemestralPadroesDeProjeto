package strategy;

import strategy.estrategias.*;

public class Main {
    public static void main(String[] args) {
        AnalisadorInvestimentos analisador = new AnalisadorInvestimentos();
        
        // Testando diferentes estratégias
        analisador.setEstrategia(new ModeloAgressivo());
        analisador.calcularPerfilRisco(100000, 30);
        
        System.out.println();
        
        analisador.setEstrategia(new ModeloModerado());
        analisador.calcularPerfilRisco(100000, 30);
        
        System.out.println();
        
        analisador.setEstrategia(new ModeloConservador());
        analisador.calcularPerfilRisco(100000, 30);
    }
    
    static class AnalisadorInvestimentos {
        private CalculoPerfilRisco estrategia;
        
        public void setEstrategia(CalculoPerfilRisco estrategia) {
            this.estrategia = estrategia;
        }
        
        public void calcularPerfilRisco(double investimento, double tolerancia) {
            if (estrategia == null) {
                throw new IllegalStateException("Estratégia não definida");
            }
            estrategia.calcularPerfil(investimento, tolerancia);
        }
    }
}