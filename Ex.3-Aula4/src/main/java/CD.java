class CD extends Produto {
    int numFaixas;

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("Número de faixas: " + numFaixas);
    }
}
