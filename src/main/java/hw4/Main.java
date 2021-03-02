package hw4;

import hw4.exceptions.StringFormatException;
import hw4.utils.DataChecker;
import hw4.utils.StringHelper;

public class Main {
    public static void main(String[] args) throws StringFormatException {
        char[] arr = {'H', 'E', 'L', 'L', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

        System.out.println("Array char: "+arr);
        char[] emptyarrr = {' '};
        String emptystr = "         ";
        String b = "  qwWErvt5y     ";
        System.out.println(StringHelper.arrayToString(b, arr));

        String validPhone = "+380630111477";
        String inValidPhone = "384477";
        DataChecker.isPhoneCorrect(validPhone);
        DataChecker.isPhoneCorrect(inValidPhone);

        String validEmail = "test@gmail.com";
        String inValidEmail = "@.wsfsdfr";
        DataChecker.isEmailCorrect(validEmail);
        DataChecker.isEmailCorrect(inValidEmail);

        String validDate = "1900-03-01";
        String inValidDate = "1800-33-01";
        DataChecker.isBirthdayCorrect(validDate);
        DataChecker.isBirthdayCorrect(inValidDate);
    }
}