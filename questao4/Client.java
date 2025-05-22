public class Client extends Wizard{
    private double saldo;
    private int pontuacao;
    Client(String nome, String varinha){
        super(nome,varinha);
        this.pontuacao=0;
        this.saldo=0;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public int getPontuacao(){
        return this.pontuacao;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo>=0?saldo:0;
    }
    public void setPontuacao(int pontuacao){
        this.pontuacao=pontuacao;
    }
}