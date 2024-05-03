package chainOfResponsability.solucao;

import chainOfResponsability.Carro;

import java.math.BigDecimal;

public class SemDesconto extends DescontoCarro{
    public SemDesconto(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}
