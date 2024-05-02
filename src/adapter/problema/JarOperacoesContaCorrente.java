package adapter.problema;

import java.math.BigDecimal;

public class JarOperacoesContaCorrente {
    // simular um Jar
    public boolean validaSaldo(BigDecimal valorPrendidoSaque) {
        System.out.println("validando saldo...");
        return true;
    }

    public void sacar(BigDecimal valorPretendido) {
        System.out.println("Sacando...");
    }

    public void deposita(BigDecimal valorPretendido) {
        System.out.println("Depositando...");
    }
}
