package hw4.exceptions;

import java.io.IOException;

public class StringFormatException extends IOException {
    public StringFormatException(String errorMessage) {
        super(errorMessage);
    }
}