package templateMethod.solucao;

import templateMethod.VeiculoParaReparo;

public class ReparaVeiculoComumServiceComTemplate extends ReparaVeiculoService{
    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoComumServiceComTemplate(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }
}
