import java.lang.Math;
public class Store{//vai ter os try catch por aqui
    private DataBase bancoDeDados;
    Store(DataBase bancoDeDados){
        this.bancoDeDados=bancoDeDados;
    }
    public void compraDeProduto(Produto produto,Client cliente) throws SaldoInsuficienteException{
        if(cliente.getSaldo() < produto.getPreco() ) throw new SaldoInsuficienteException();//valor total da compra
        else{
            try{
                bancoDeDados.atualizar(produto);
                cliente.setSaldo(cliente.getSaldo()-produto.getPreco());
                cliente.setPontuacao(cliente.getPontuacao()+ (int)Math.round(0.1*produto.getPreco()));
            }
            catch(ProdIndisponivelException excecao){
                System.out.println(excecao.getMessage());
            }
            catch(ProdNaoEncontradoException excecao){
                System.out.println(excecao.getMessage());
            }
            finally{
                if(recebeBrinde(cliente)){
                    try{
                        System.out.println("Parabens! Tome seu brinde");
                        bancoDeDados.atualizar(bancoDeDados.localizaMenorProduto(produto));
                    }
                    catch(ProdIndisponivelException excecao){
                        System.out.println(excecao.getMessage());
                    }
                    catch(ProdNaoEncontradoException excecao){
                        System.out.println(excecao.getMessage());
                    }
                }
            }
        }
    }
    private boolean recebeBrinde(Client cliente){
        if(cliente.getPontuacao()>=500) return true;
        else return false;
    }

    public void adicionaProdALoja(Produto produto){
        try{
            bancoDeDados.inserir(produto);
        }
        catch(qtdProdException excecao){
            System.out.println(excecao.getMessage());
        }
        catch(ProdJaExisteException excecao){
            System.out.println(excecao.getMessage());
        }
    }

    public void removeProdLoja(Produto produto){
        try{
            bancoDeDados.remover(produto);
        }
        catch(ProdNaoEncontradoException excecao){
            System.out.println(excecao.getMessage());
        }
    }
    
}