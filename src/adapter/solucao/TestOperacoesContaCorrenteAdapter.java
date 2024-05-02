package adapter.solucao;

import adapter.problema.ClientJarOperacoesContaCorrente;
import adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TestOperacoesContaCorrenteAdapter {
    public static void main(String[] args) throws IllegalAccessException {
        JarOperacoesContaCorrente jarOperacoesContaCorrente = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarOperacoesContaCorrente);
        ClientJarOperacoesContaCorrenteAdapter clientJarOperacoesContaCorrente = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        var valorPretendidoParaSaque = BigDecimal.valueOf(151);

        clientJarOperacoesContaCorrente.sacar(valorPretendidoParaSaque);

        clientJarOperacoesContaCorrente.deposita(BigDecimal.valueOf(500));
    }
}
