package strategy.problema;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalario {
    public void calculaReajusteAnual (Funcionario funcionario) {
        if (funcionario.getTipoContratacao().equals(TipoContratacaoEnum.CLT)) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
        } else if (funcionario.getTipoContratacao().equals(TipoContratacaoEnum.PJ)) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
        } else if (funcionario.getTipoContratacao().equals(TipoContratacaoEnum.ESTAGIO)) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
        }
    }
}
