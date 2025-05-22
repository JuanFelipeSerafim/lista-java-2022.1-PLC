public class Main{
    public static void main(String[] args) {
        Robot robo1= new Robot("Robonilson", "Rua de algum lugar", 54956125),robo2=new Robot("Mecanico","Rua dois",84512261),robo3=new Robot("Joverbal", "Rua diferente", 54956125);
        Adult adulto1 = new Adult("Juan", "Rua de algum lugar", 52041535,"tec em eletronica" );
        Child filhoDeAdulto1=new Child("Adulto1 junior", "Rua de algum lugar", 52041535, "carro de controle remoto");
        robo1.greet(robo2);//cep diferente
        robo1.greet(robo3);
        robo1.greet(adulto1);

        adulto1.addKid(filhoDeAdulto1);
        filhoDeAdulto1.greet(robo1);
        filhoDeAdulto1.greet(robo2);

        filhoDeAdulto1.mostraAmigos();

        

    }
}