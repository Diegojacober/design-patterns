package prototype.problema;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {
    public BotaoAmarelo() {
        setCor("Amarela");
        setAltura(40);
        setLargura(118);
        setTipoBorda(TipoBordaEnum.GROSSA);
    }
}