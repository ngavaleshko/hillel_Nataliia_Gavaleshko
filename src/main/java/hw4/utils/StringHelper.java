package hw4.utils;

import hw4.exceptions.StringFormatException;

public class StringHelper {

    public static String arrayToString(String string, char[] args) throws StringFormatException {
        String b;
        String str;
        if (args == null || args.length == 0) {
            throw new NullPointerException("Error. Expected not null");
        } else {
            b = new String(args);
        }
        if (string.replace(" ", "").isEmpty() || b.replace(" ", "").isEmpty()) {
            throw new StringFormatException("Error. Expected not null");
        } else {
            str = string.toUpperCase().trim() + " " + b.toLowerCase().trim();
        }
        System.out.println("t = " + str);

        return (str.length()%2==0)? str.substring(str.length()/2 - 1,str.length()/2+1): str.substring(str.length()/2,str.length()/2+1);
    }

}