package adapter.solucao;

import adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class JarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrente jarConta;

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
        this.jarConta = jarConta;
    }


    public void sacar(BigDecimal valorPretendido) throws IllegalAccessException {
        if (jarConta.validaSaldo(valorPretendido)){
            jarConta.sacar(valorPretendido);
        } else {
            throw new IllegalAccessException("Valor para saque não permitido");
        }


    }

    public void deposita(BigDecimal valorPretendido) {
        jarConta.deposita(valorPretendido);
    }
}
