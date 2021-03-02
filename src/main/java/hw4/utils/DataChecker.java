package hw4.utils;

public class DataChecker {
    public static boolean isPhoneCorrect(String pho) {
        boolean result = pho.matches("^[0-9\\+380]{13}$");
        if (result) {
            System.out.println("Valid phone is = " +pho);
            return true;
        } else {
            System.out.println("Invalid phone is = " +pho);
            return false;
        }
    }

    public static boolean isEmailCorrect(String email) {
        boolean result;
        result = email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        if (result) {
            System.out.println("email is ok: "+ email);
            return result;
        } else {
            System.out.println("email is not ok: "+email);
            return result;
        }
    }

    public static boolean isBirthdayCorrect(String date) {
        boolean result;
        result = date.matches("((?:19|20)\\d\\d)-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$");
        if (result) {
            System.out.println("Date is valid: "+date);
            return result;
        }else{
            System.out.println("Date is invalid: "+date);
            return result;
        }
    }
}