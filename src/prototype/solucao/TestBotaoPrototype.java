package prototype.solucao;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class TestBotaoPrototype {
    public static void main(String[] args) {
        // no registry fica registrado os prototipos
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);

        // cada get cria um nova instancia, um novo clone
        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);
        botaoAzul.setLargura(451);
        System.out.println(botaoAzul);

        String chave = "BOTAO_ROXO";
        Botao botaoRoxo = new Botao();
        botaoRoxo.setCor("Roxa");
        botaoRoxo.setAltura(37);
        botaoRoxo.setLargura(210);
        botaoRoxo.setTipoBorda(TipoBordaEnum.GROSSA);
        BotaoRegistry.addRegistry(chave, botaoRoxo);

        Botao botaoRoxoClone = BotaoRegistry.getBotao("BOTAO_ROXO");
        System.out.println(botaoRoxoClone);
    }
}
