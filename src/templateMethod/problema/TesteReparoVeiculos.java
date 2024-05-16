package templateMethod.problema;

import templateMethod.VeiculoParaReparo;

public class TesteReparoVeiculos {
    public static void main(String[] args) {
        System.out.println("--------------------LUXO--------------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        ReparaVeiculoDeLuxoService rpl = new ReparaVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();


        System.out.println("--------------------------------------------");

        System.out.println("--------------------COMUM-------------------");
        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparaVeiculoComumService rpc = new ReparaVeiculoComumService(veiculoComum);

        rpc.reparaVeiculo();
    }
}
