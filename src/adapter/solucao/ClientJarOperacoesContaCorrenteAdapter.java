package adapter.solucao;

import adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrenteAdapter jarAdpater;

    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jocc) {
        this.jarAdpater = jocc;
    }

    public void sacar(BigDecimal valorPretendido) throws IllegalAccessException {
        jarAdpater.sacar(valorPretendido);
    }

    public void deposita(BigDecimal valor) {
        jarAdpater.deposita(valor);
    }
}
