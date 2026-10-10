import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Aluguel> alugueis;

    public Cliente(String nome) {
        this.nome = nome;
        this.alugueis = new ArrayList<>();
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String getNome() {
        return nome;
    }

    public String extrato() {

        double valorTotal = 0;
        int pontosDeAlugadorFrequente = 0;

        String resultado = "Registro de Aluguéis de "
                + getNome() + "\n";

        for (Aluguel aluguel : alugueis) {

            double valorCorrente =
                    aluguel.getValor();

            pontosDeAlugadorFrequente +=
                    aluguel.getPontosFrequentes();

            resultado += "\t"
                    + aluguel.getFita().getTitulo()
                    + "\t"
                    + valorCorrente
                    + "\n";

            valorTotal += valorCorrente;
        }

        resultado += "Valor total devido: "
                + valorTotal + "\n";

        resultado += "Você ganhou "
                + pontosDeAlugadorFrequente
                + " pontos de alugador frequente";

        return resultado;
    }
}