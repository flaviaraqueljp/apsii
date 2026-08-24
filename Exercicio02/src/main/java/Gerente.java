class Gerente extends FuncionarioCLT {
    int tamanhoEquipe;
    double percentualBonus;

    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao,
                   double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (salarioBase * percentualBonus);
    }

    @Override
    public double calcularDesconto() {
        double desconto = super.calcularDesconto();
        if (tamanhoEquipe > 10) {
            desconto += 100.0;
        }
        return desconto;
    }
}