package exception;

public class WrongSumException extends Exception {
    public  WrongSumException(String sumErrorMessage){
        super (sumErrorMessage);
    }
}