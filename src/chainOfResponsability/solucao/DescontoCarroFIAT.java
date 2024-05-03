package chainOfResponsability.solucao;

import chainOfResponsability.Carro;
import chainOfResponsability.Marca;

import java.math.BigDecimal;

public class DescontoCarroFIAT extends DescontoCarro{

    public DescontoCarroFIAT(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (Marca.FIAT.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(1000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
