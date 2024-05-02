package strategy.problema;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class TestAjusteSalarioSemStrategy {
    public static void main(String[] args) {
        ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();

        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Angelo");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(BigDecimal.valueOf(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Diego");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(BigDecimal.valueOf(10000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Julia");
        funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(BigDecimal.valueOf(500));

        // calcular reajustes aqui
        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT);
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ);
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagio);

        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
        System.out.println(funcionarioCLT);
    }
}
