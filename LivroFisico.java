public class LivroFisico extends Livro {

    public LivroFisico(String titulo, Integer anoPublicacao, Autor autor, Integer numeroDePaginas) {
        super(titulo, anoPublicacao, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    private Integer numeroDePaginas;

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String exibirDetalhes() {
        return super.exibirDetalhes() + "\nNumero de Paginas : " + numeroDePaginas;
    }

}