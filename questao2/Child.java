public class Child extends Human{
    private String brinquedo;

    Child(String nome, String endereco, int cep,String brinquedo){
        super(nome,endereco,cep);
        this.brinquedo=brinquedo;
    }
    @Override 
    public void greet(Citizen cidadao){
        System.out.println("Olá "+cidadao.getNome()+"! Seja meu camarada. Quer brincar com meu "+this.brinquedo+"?");
        if(jaEhAmigo(cidadao)){
            System.out.println("Ja te conheco ja, po!");
        }
        else if(this.getContadorDeAmigos()<5){
            adicionarAmigos(cidadao);
        }
        else{
            System.out.println("To com amigo demais, desculpa :(");
        }
    }

    
}