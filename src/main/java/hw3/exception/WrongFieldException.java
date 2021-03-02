package hw3.exception;

public class WrongFieldException extends Exception {
    public WrongFieldException (String fieldErrorMessage){
        super (fieldErrorMessage);
    }
}