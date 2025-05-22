public class DataBaseWeasleys implements DataBase{
    private Produto[] produtos;
    private int qtdProdutos;
    DataBaseWeasleys(){
        this.produtos=new Produto[50];
        this.qtdProdutos=0;
    }
    private Produto localizaProduto(Produto produto){
        for(Produto i:produtos){
            if(i!=null && i.getNomeProd()==produto.getNomeProd()){
                return i;
            }
        }
        return null;
    }

    private int retornaIndiceProduto(Produto produto){
        int j=0;
        for(Produto i:produtos){
            if(i!=null && i.getNomeProd()==produto.getNomeProd()){
                return j;
            }
            j++;
        }
        return -1;
    }
    public Produto localizaMenorProduto(Produto produto){
        Produto p= new Produto("nomequalquer", 0, 1000000.0);
        for(Produto i:produtos){
            if(i!=null && i.getPreco()<=p.getPreco()){
                p=i;
            }
        }
        return p;
    }
    public void inserir(Produto produto) throws qtdProdException,ProdJaExisteException{
        Produto produtoTemporario=localizaProduto(produto);
        if(produtoTemporario==null){
            if(this.qtdProdutos<50){
                this.produtos[this.qtdProdutos]=produto;
                this.qtdProdutos++;
            }
            else throw new qtdProdException();
        }
        else throw new ProdJaExisteException();
    }
    public void remover(Produto produto) throws ProdNaoEncontradoException{
        int indice=retornaIndiceProduto(produto);
        Produto p;
        if(indice==-1) throw new ProdNaoEncontradoException();
        else if(this.qtdProdutos!=0){
            p=this.produtos[this.qtdProdutos-1];
            this.produtos[indice]=p;
            this.produtos[this.qtdProdutos-1]=null;
            this.qtdProdutos--;
        }
        else throw new ProdNaoEncontradoException();
    }
    public void atualizar(Produto produto) throws ProdNaoEncontradoException, ProdIndisponivelException{//CONSIDERANDO QUE ESSE METODO SERÁ UNICAMENTE UTILIZADO PARA MUDAR A QTD DE PRODUTOS E NÃO ATUALIZAR O VALOR DA COMPRA, MUITO MENOS A QUANTIDADE DE PRODUTO DISPONIVEL... E uma forma de burlar isso seria Remover o produto e adicioná-lo novamente c/uma qtd maior e valor alterado 
        Produto p=localizaProduto(produto);
        if(p==null) throw new ProdNaoEncontradoException();
        else if(p.getQtdProd()>0){
            p.setQtdProd(p.getQtdProd()-1);
        }
        else throw new ProdIndisponivelException();
    }

    
}



