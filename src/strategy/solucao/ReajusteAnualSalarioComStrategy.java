package strategy.solucao;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalarioComStrategy {
    public void calculaReajusteAnual (Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {
      calculador.calcularReajusteAnual(funcionario);
    }
}
