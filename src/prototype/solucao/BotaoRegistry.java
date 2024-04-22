package prototype.solucao;

import prototype.Botao;
import prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {
    private static BotaoRegistry botaoRegistry;

    // vai registrar os protótipos
    private static Map<String, Botao> REGISTRY = new HashMap<>();

    // executado assim que a classe for inicializada
    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarela");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(118);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.GROSSA);

        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("Vermelha");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
    }

    public static Botao getBotao(String chave) {
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave, botao);
    }
}
