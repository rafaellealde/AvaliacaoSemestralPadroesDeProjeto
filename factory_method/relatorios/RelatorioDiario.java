package factory_method.relatorios;

public class RelatorioDiario implements Relatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando relatório diário...");
        System.out.println("- Fonte: dados do dia");
        System.out.println("- Métricas: prioridade alta");
        System.out.println("- Formato: PDF rápido");
    }
}