package hw3.exception;

public class UserExpectedError extends RuntimeException {
    public UserExpectedError(String userErrorMessage){
        super(userErrorMessage);
    }
}