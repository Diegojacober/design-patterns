package templateMethod.solucao;

import templateMethod.VeiculoParaReparo;

public class TesteReparoVeiculosTemplateMethod {
    public static void main(String[] args) {
        System.out.println("--------------------LUXO--------------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        ReparaVeiculoService rpl = new ReparaVeiculoLuxoServiceComTemplate(veiculoDeLuxo);

        rpl.reparaVeiculo();


        System.out.println("--------------------------------------------");

        System.out.println("--------------------COMUM-------------------");
        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparaVeiculoService rpc = new ReparaVeiculoComumServiceComTemplate(veiculoComum);

        rpc.reparaVeiculo();
    }
}
