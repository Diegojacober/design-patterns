package adapter.problema;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrente {
    private JarOperacoesContaCorrente jocc;

    public ClientJarOperacoesContaCorrente(JarOperacoesContaCorrente jocc) {
        this.jocc = jocc;
    }

    public boolean validaSaldo(BigDecimal valorPrendidoSaque) {
        return jocc.validaSaldo(valorPrendidoSaque);
    }

    public void sacar(BigDecimal valorPretendido) {
        jocc.sacar(valorPretendido);
    }

    public void deposita(BigDecimal valorPretendido) {
        jocc.deposita(valorPretendido);
    }
}
