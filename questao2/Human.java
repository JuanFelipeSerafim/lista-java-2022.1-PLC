public class Human extends Citizen{
    private Citizen[] amigos;
    private int contadorDeAmigos;
    Human(String nome, String endereco, int cep){
        super(nome,endereco,cep);
        this.amigos= new Citizen[5];
        this.contadorDeAmigos=0;
    }
    protected boolean jaEhAmigo(Citizen cidadao){
        for(Citizen i:this.amigos){
            if(i!=null && i.getNome()==cidadao.getNome() && i.getCep()==cidadao.getCep() && i.getEndereco()==cidadao.getEndereco())
                return true;
        }
        return false;
    }
    public void greet(Citizen cidadao){
        System.out.println("Olá "+cidadao.getNome()+"!\nSeja meu camarada");
        if(jaEhAmigo(cidadao)){
            System.out.println("Ja te conheco ja, po!");
        }
        else if(this.contadorDeAmigos<5){
            adicionarAmigos(cidadao);
        }
        else{
            System.out.println("To com amigo demais, desculpa :(");
        }

    }
    protected int getContadorDeAmigos(){
        return this.contadorDeAmigos;
    }
    protected void setContadorDeAmigos(int numeroNovo){
        this.contadorDeAmigos=numeroNovo;
    }
    protected void adicionarAmigos(Citizen cidadao){
        this.amigos[this.contadorDeAmigos]=cidadao;
        this.contadorDeAmigos++;
    }
    public void mostraAmigos(){
        for(Citizen i:this.amigos){
            if(i!=null){
                System.out.println(i.getNome());
            }
        }
    }


}