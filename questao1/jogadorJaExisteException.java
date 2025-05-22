public class jogadorJaExisteException extends Exception {
    jogadorJaExisteException(){
        super("Jogador ja foi adicionado");
    }
}