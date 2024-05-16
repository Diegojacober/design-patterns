package templateMethod.problema;

import templateMethod.VeiculoParaReparo;

public class ReparaVeiculoComumService {
    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoComumService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void reparaVeiculo() {
        entradaOficina();
        analisarDanos();
        if (veiculoParaReparo()) {
            repararVeiculo();
            notificarReparoParaSeguradora();
        } else {
            notificaPerdaTotalParaSeguradora();
        }
    }

    private boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }

    private void notificaPerdaTotalParaSeguradora() {
        System.out.println("Notificando perda total para a seguradora");
    }

    private void notificarReparoParaSeguradora() {
        System.out.println("Notificando reparo para a seguradora");
    }

    private void repararVeiculo() {
        System.out.println("Reparando veiculo...");
    }

    private void analisarDanos() {
        System.out.println("Analisando danos...");
    }

    private void entradaOficina() {
        System.out.println("Veículo entrando na oficina...");
    }
}