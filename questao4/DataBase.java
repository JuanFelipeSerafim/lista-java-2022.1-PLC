public interface DataBase{
    void inserir(Produto produto)throws qtdProdException,ProdJaExisteException;
    void remover(Produto produto)throws ProdNaoEncontradoException;
    void atualizar(Produto produto) throws ProdNaoEncontradoException, ProdIndisponivelException;
    Produto localizaMenorProduto(Produto produto);
}