public class Main{
    public static void main(String[] args) {
        Store lojinha=new Store(new DataBaseWeasleys());
        Produto produtos[]={new Produto("produto1", 25, 20),//produto repetido aqui!!
        new Produto("produto2", 25, 30),
        new Produto("produto3", 25, 10),
        new Produto("produto4", 25, 20),
        new Produto("produto5", 25, 7.5),
        new Produto("produto5", 25, 2.0),
        new Produto("produto6", 25, 200),
        new Produto("produto7", 25, 9.99),
        new Produto("produto8", 25, 2.5),
        new Produto("produto9", 25, 15),
        new Produto("produto10", 25,14),
        new Produto("produto11", 25, 1.5)};

        Client cliente1=new Client("Juan", "naoManjoDeHarryPotter");
        cliente1.setSaldo(5000);
        cliente1.setPontuacao(470);

        for(Produto i:produtos){
            lojinha.adicionaProdALoja(i);//adicao de produto repetido
        }
        //----------------------------
        System.out.println("Saldo: "+cliente1.getSaldo()+" Pontuacao: "+cliente1.getPontuacao());
        try{
            lojinha.compraDeProduto(produtos[2], cliente1);
        }
        catch(SaldoInsuficienteException excecao){
            System.out.println(excecao.getMessage());
        }
        //----------------------------
        System.out.println("Saldo: "+cliente1.getSaldo()+" Pontuacao: "+cliente1.getPontuacao());
        try{
            lojinha.compraDeProduto(new Produto("produto178", 0, 20), cliente1);
        }
        catch(SaldoInsuficienteException excecao){
            System.out.println(excecao.getMessage());
        }
        //---------------------------- objetivo daqui e ganhar o brinde
        try{
            lojinha.compraDeProduto(produtos[6], cliente1);
        }
        catch(SaldoInsuficienteException excecao){
            System.out.println(excecao.getMessage());
        }

        try{
            lojinha.compraDeProduto(produtos[6], cliente1);
        }
        catch(SaldoInsuficienteException excecao){
            System.out.println(excecao.getMessage());
        }
        //----------------------------

        System.out.println("Saldo: "+cliente1.getSaldo()+" Pontuacao: "+cliente1.getPontuacao());

        
        for(Produto i:produtos){
            lojinha.removeProdLoja(i);//como tem produto repetido, ele vai tentar remover um q ja foi removido
        }

    }
}