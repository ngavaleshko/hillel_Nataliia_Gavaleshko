package util;

import exception.UserExpectedError;
import exception.WrongFieldException;
import exception.WrongSumException;

public class Helper {
    public static void accountIdChecker(String accountId) throws WrongFieldException {
        System.out.println("The string size is " + accountId.length());
        if (accountId.length() != 10) {
            throw new WrongFieldException("Error. Expected accountId = 10. Please try again ");
        }

    }

    public static void checkSum(double sum) throws WrongSumException {
        double valid = 1000;
        if (sum > valid) {
            throw new WrongSumException("Error. Sum must be lower than or equals 1000");
        }

    }

    public static void checkUsers(String accountIdSender, String accountIdReceiver) {
        if (!accountIdSender.equals(accountIdReceiver)) {
            throw new UserExpectedError("Invalid AccountIds. should be same ");
        }
    }
}
