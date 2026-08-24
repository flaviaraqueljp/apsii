class FuncionarioCLT extends Funcionario {
    double valeTransporte;
    double valeAlimentacao;

    public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao,
                          double valeTransporte, double valeAlimentacao) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valeTransporte + valeAlimentacao;
    }

    @Override
    public double calcularDesconto() {
        return super.calcularDesconto() + 50.0;
    }
}
