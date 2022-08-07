package exception;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
    public InsufficientFundsException(){
        super("Insufficient Funds i Exception");
    }
}
