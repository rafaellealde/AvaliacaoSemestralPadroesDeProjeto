package factory_method;

import factory_method.factories.RelatorioFactory;
import factory_method.factories.RelatorioFactoryImpl;
import factory_method.relatorios.Relatorio;

public class Main {
    public static void main(String[] args) {
        RelatorioFactory factory = new RelatorioFactoryImpl();
        
        Relatorio diario = factory.criarRelatorio("diario");
        diario.gerar();
        
        System.out.println();
        
        Relatorio semanal = factory.criarRelatorio("semanal");
        semanal.gerar();
    }
}