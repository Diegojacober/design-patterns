package adapter;

import adapter.problema.ClientJarOperacoesContaCorrente;
import adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TestOperacoesContaCorrente {
    public static void main(String[] args) {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente clientJarOperacoesContaCorrente = new ClientJarOperacoesContaCorrente(jarConta);

        var valorPretendidoParaSaque = BigDecimal.valueOf(151);

        // depende do programador usar o if e a função de validar o saldo
        if (clientJarOperacoesContaCorrente.validaSaldo(valorPretendidoParaSaque)) {
            clientJarOperacoesContaCorrente.sacar(valorPretendidoParaSaque);
        }

        clientJarOperacoesContaCorrente.deposita(BigDecimal.valueOf(500));


    }
}
