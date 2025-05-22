public class Robot extends Citizen{
    Robot(String nome, String endereco, int cep){
        super(nome,endereco,cep);
    }
    public void greet(Citizen cidadao){
        if(cidadao instanceof Robot){
            if(cidadao.getCep()==super.getCep()){//this.getCep() tbm deve pegar!!
                System.out.println("Olá robô "+cidadao.getNome()+"!");
            }
            else System.out.println("Nem te conheco, robô");
        }
        else{
            System.out.println("Sai fora, humano");
        }
    }


}