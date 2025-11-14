package factory_method.factories;

import factory_method.relatorios.Relatorio;

public interface RelatorioFactory {
    Relatorio criarRelatorio(String tipo);
}