package strategy.solucao;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;
import strategy.problema.ReajusteAnualSalario;

import java.math.BigDecimal;

public class TestAjusteSalarioComStrategy {

    // Open closed principle, fechada para alteração e aberta para extensões
    public static void main(String[] args) {

        ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();

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

        Funcionario funcionarioCooperativa = new Funcionario();
        funcionarioCooperativa.setNome("Laura");
        funcionarioCooperativa.setTipoContratacao(TipoContratacaoEnum.COOPERATIVA);
        funcionarioCooperativa.setSalario(BigDecimal.valueOf(5500));


        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT, new CalculadorReajusteCLT());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ, new CalculadorReajustePJ());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagio, new CalculadorReajusteEstagiario());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioCooperativa, new CalculadorReajusteCooperativa());

        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
        System.out.println(funcionarioCLT);
    }
}
