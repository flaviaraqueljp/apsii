class Livro extends Produto {
    String autor;

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("Autor: " + autor);
    }
}
