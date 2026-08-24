class Estagiario extends Funcionario {
    double valorBolsaAuxilio;
    int cargaHorariaSemanal;

    public Estagiario(String nome, String matricula, double salarioBase, String dataAdmissao,
                      double valorBolsaAuxilio, int cargaHorariaSemanal) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    @Override
    public double calcularSalario() {
        return valorBolsaAuxilio;
    }

    @Override
    public double calcularDesconto() {
        return 0.0;
    }
}