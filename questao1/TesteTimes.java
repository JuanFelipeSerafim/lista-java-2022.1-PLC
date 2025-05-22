public class TesteTimes{
    public static void main(String[] args) {
        int localizacoes[][]={{39,27},{274,9},{540,65},{34,524},{54,82},{56,982},{69,482},{37,569},{454,58},{75,568},{658,3},{83,932},{53,42},{658,8},{735,343},{475,468},{365,79},{346,879},{545,78},{546,895},{344,788},{83,386},{833,125}};
        Team times[]= { new Team(),
            new Team(new Robot("jogador01",1,localizacoes[7]),
            new Robot("jogador02",15,localizacoes[13]),
            new Robot("jogador03",12,localizacoes[14]),
            new Robot("jogador04",18,localizacoes[15]),
            new Robot("jogador05",8,localizacoes[16]),
            new Robot("jogador06",7,localizacoes[17]),
            new Robot("jogador07",56,localizacoes[18]),
            new Robot("jogador08",57,localizacoes[19]),
            new Robot("jogador09",17,localizacoes[8]),
            new Robot("jogador010",64,localizacoes[2]),
            new Robot("jogador011",85,localizacoes[5]),
            new Robot("jogador012",23,localizacoes[11]))};
        
        times[0].showReserva();
        System.out.println("--------------------------------------------------------");
        times[0].showTitulares();
        System.out.println("--------------------------------------------------------");
        try{
            times[0].adicionaJogadorTitular(new Robot("jogador1",32,localizacoes[0]));
            times[0].adicionaJogadorTitular(new Robot("jogador2",53,localizacoes[1]));
            times[0].adicionaJogadorReserva(new Robot("jogador3",235,localizacoes[2]));
            times[0].adicionaJogadorReserva(new Robot("jogador4",533,localizacoes[3]));
        }
        catch(jogadorJaExisteException e){
            System.out.println(e.getMessage());
        }
        times[0].showTitulares();
        System.out.println("--------------------------------------------------------");
        times[0].showReserva();
        System.out.println("--------------------------------------------------------");

        try {
            times[0].substituiJogador(times[0].getTitular("jogador2"), times[0].getReserva("jogador3"));
        }
        catch(jogadorInexistenteException e){
            System.out.println(e.getMessage());
        }

        times[0].showTitulares();
        System.out.println("--------------------------------------------------------");
        times[0].showReserva();
        System.out.println("--------------------------------------------------------");

        
        times[1].showTitulares();
        System.out.println("--------------------------------------------------------");
        times[1].showReserva();
        System.out.println("--------------------------------------------------------");

        try{
            times[1].substituiJogador(times[1].getReserva("jogador011"));
        }
        catch(jogadorInexistenteException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage()+"\nSEM ESSE JOGADOR\n");
        }
        times[1].showTitulares();
        System.out.println("--------------------------------------------------------");
        times[1].showReserva();
        System.out.println("--------------------------------------------------------");
        
    }
}