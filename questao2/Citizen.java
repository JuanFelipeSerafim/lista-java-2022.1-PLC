public abstract class Citizen{
    private String nome,endereco;
    private int cep;
    
    Citizen(String nome, String endereco, int cep){
        this.nome=nome;
        this.endereco=endereco;
        this.cep=cep;
    }
//---------------------------
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public int getCep(){
        return this.cep;
    }
//---------------------------
    public abstract void greet(Citizen cidadao);

}