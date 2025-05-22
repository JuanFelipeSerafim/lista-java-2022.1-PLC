public class Produto{
    private String nomeProd;
    private int quantidade;
    private double preco;
    
    Produto(String nomeProd, int quantidade,double preco){
        this.nomeProd=nomeProd;
        this.quantidade=quantidade;
        this.preco=preco;
    }
    
    public String getNomeProd(){
        return this.nomeProd;
    }
    public int getQtdProd(){
        return this.quantidade;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setNomeProd(String nome){
        this.nomeProd=nome;
    }
    public void setQtdProd(int quantidade){
        this.quantidade=quantidade;
    }
    public void setPreco(float preco){
        this.preco=preco;
    }
}