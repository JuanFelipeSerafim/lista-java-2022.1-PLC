public class Team{
    private Robot[] timeTitular,timeReserva;
    private int numJogadoresTitular,numJogadoresReserva;

    
    Team(){
        this.timeTitular= new Robot[6];
        this.timeReserva= new Robot[6];
        this.numJogadoresTitular=0;
        this.numJogadoresReserva=0;
    }
    Team(Robot j1,Robot j2,Robot j3,Robot j4,Robot j5, Robot j6,Robot jR1,Robot jR2,Robot jR3,Robot jR4,Robot jR5, Robot jR6){
        this.timeTitular= new Robot[] {j1,j2,j3,j4,j5,j6};
        this.timeReserva= new Robot[] {jR1,jR2,jR3,jR4,jR5,jR6};
        this.numJogadoresTitular=5;
        this.numJogadoresReserva=5;  
    }

    private boolean existeMesmoNome(Robot jogador){
        for(Robot i:timeReserva){
            if(i!=null && i.getNome()==jogador.getNome()) 
                return true;
        }
        for(Robot i:timeTitular){
            if(i!=null && i.getNome()==jogador.getNome()) 
                return true;
        }
        return false;
    }

    private int retornaIndiceJogadorReserva(Robot jogador){
        int j=0;
        for(Robot i:timeReserva){
            if(i.getNome()==jogador.getNome()) 
                return j;
            j++;
        }
        return -1;
    }

    private int retornaIndiceJogadorTitular(Robot jogador){
        int j=0;
        for(Robot i:timeTitular){
            if(i.getNome()==jogador.getNome()) 
                return j;
            j++;
        }
        return -1;
    }
    
    public void adicionaJogadorTitular(Robot jogador) throws jogadorJaExisteException{
        if(!existeMesmoNome(jogador) && this.numJogadoresTitular<6){
            this.timeTitular[this.numJogadoresTitular]=jogador;
            this.numJogadoresTitular++;
        }
        else throw new jogadorJaExisteException();
    }

    public void adicionaJogadorReserva(Robot jogador) throws jogadorJaExisteException{//implementar exception aqui
        if(!existeMesmoNome(jogador) && this.numJogadoresReserva<6){
            this.timeReserva[this.numJogadoresReserva]=jogador;
            this.numJogadoresReserva++;
        }
        else throw new jogadorJaExisteException();
    }

    public void substituiJogador(Robot titular,Robot reserva) throws jogadorInexistenteException{//implementar exception aqui
        Robot temporario;
        int indiceJogadorTitular=retornaIndiceJogadorTitular(titular),
        indiceJogadorReserva=retornaIndiceJogadorReserva(reserva);
        if(indiceJogadorReserva!=-1 && indiceJogadorTitular!=-1){
            temporario=this.timeTitular[indiceJogadorTitular];
            this.timeTitular[indiceJogadorTitular]=this.timeReserva[indiceJogadorReserva];
            this.timeReserva[indiceJogadorReserva]=temporario;
        }
        else throw new jogadorInexistenteException();

    }

    public void substituiJogador(Robot reserva) throws jogadorInexistenteException{//implementar exception aqui
        int indiceJogadorReserva=retornaIndiceJogadorReserva(reserva);
        Robot temporario=this.timeTitular[0];
        if(indiceJogadorReserva!=-1){
            this.timeTitular[0]=this.timeReserva[indiceJogadorReserva];
            this.timeReserva[indiceJogadorReserva]=temporario;
        }   
        else throw new jogadorInexistenteException();
    }
    public Robot getTitular(String nome){
        for(Robot i:timeTitular){
            if(i.getNome()==nome) 
                return i;
        }
        return null;
    }

    public Robot getReserva(String nome){
        for(Robot i:timeReserva){
            if(i.getNome()==nome) 
                return i;
        }
        return null;
    }

    public void showTitulares(){
        for(Robot i:this.timeTitular){
            if(i!=null) 
                System.out.println(i.getNome()+'\n'+i.getNumCamisa()+'\n'+'('+i.getLocalizacao()[0]+','+i.getLocalizacao()[1]+')'+"\n\n");
        }
    }

    public void showReserva(){
        for(Robot i:this.timeReserva){
            if(i!=null)
            System.out.println(i.getNome()+'\n'+i.getNumCamisa()+'\n'+'('+i.getLocalizacao()[0]+','+i.getLocalizacao()[1]+')'+"\n\n");
        }
    }

}