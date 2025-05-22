public class Adult extends Human{
    private String profissao;
    private Child[] filhos;
    private int contadorDeFilhos;
    Adult(String nome, String endereco, int cep,String profissao){
        super(nome,endereco,cep);
        this.profissao=profissao;
        this.filhos = new Child[4];
        this.contadorDeFilhos=0;
    }
    public void addKid(Child filho){
        if(this.contadorDeFilhos<4){
            this.filhos[this.contadorDeFilhos]=filho;
            this.contadorDeFilhos++;
        }
        else{
            System.out.println("Tenho filhos demais!");
        }
    }
    public String getProfissao(){
        return this.profissao;
    }
}