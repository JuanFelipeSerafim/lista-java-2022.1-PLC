public class Robot{
    private String nome;
    private int numCamisa;
    private int[] localizacao;

    Robot(String nome , int numCamisa, int[] localizacao){
        this.nome=nome;
        this.numCamisa=numCamisa;
        this.localizacao=localizacao;
    }
    Robot(String nome){
        this.nome=nome;
        this.numCamisa=-1;
        this.localizacao= new int[] {-1,-1};
    }
//------------------------------------------
    public String getNome(){
        return this.nome;
    }
    public int getNumCamisa(){
        return this.numCamisa;
    }
    public int[] getLocalizacao(){
        return this.localizacao;
    }
//------------------------------------------
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setNumero(int numCamisa){
        this.numCamisa=numCamisa;
    }
    public void setLocalizacao(int[] localizacao){
        this.localizacao=localizacao;
    }

    
}