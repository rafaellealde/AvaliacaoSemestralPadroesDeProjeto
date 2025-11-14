package factory_method.relatorios;

public class RelatorioSemanal implements Relatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando relatório semanal...");
        System.out.println("- Fonte: dados consolidados");
        System.out.println("- Métricas: análise completa");
        System.out.println("- Formato: PDF detalhado");
    }
}