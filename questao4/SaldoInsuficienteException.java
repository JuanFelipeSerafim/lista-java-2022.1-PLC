public class SaldoInsuficienteException extends Exception{
    SaldoInsuficienteException(){
        super("Sem valor necessario p/ comprar produto");
    }
}