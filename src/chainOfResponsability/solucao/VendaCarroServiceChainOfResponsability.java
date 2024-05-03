package chainOfResponsability.solucao;

import chainOfResponsability.Carro;
import chainOfResponsability.Marca;

import java.math.BigDecimal;

public class VendaCarroServiceChainOfResponsability {
    public BigDecimal calculaValorVenda(Carro carro) {
        DescontoCarro desconto = new DescontoCarroFIAT(
                new DescontoCarroFORD(
                        new DescontoCarroValorMaiorQueCemMil(
                                new SemDesconto(null)
                        )
                )
        );

        return  desconto.aplicaDesconto(carro);

    }
}
