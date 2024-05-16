package templateMethod.solucao;

import templateMethod.VeiculoParaReparo;

public class ReparaVeiculoLuxoServiceComTemplate extends ReparaVeiculoService{
    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoLuxoServiceComTemplate(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}
