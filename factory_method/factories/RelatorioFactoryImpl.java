package factory_method.factories;

import factory_method.relatorios.Relatorio;
import factory_method.relatorios.RelatorioDiario;
import factory_method.relatorios.RelatorioSemanal;

public class RelatorioFactoryImpl implements RelatorioFactory {
    @Override
    public Relatorio criarRelatorio(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "diario" -> new RelatorioDiario();
            case "semanal" -> new RelatorioSemanal();
            default -> throw new IllegalArgumentException("Tipo de relatório não suportado: " + tipo);
        };
    }
}