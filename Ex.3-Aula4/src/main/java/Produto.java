class Produto implements InfoGerais {
    String nome;
    double preco;

    @Override
    public void exibeInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
