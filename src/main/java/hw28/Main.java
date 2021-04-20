package hw28;


import hw28.functionalInterface.ConsumerInterface;
import hw28.functionalInterface.FunctionInterface;
import hw28.functionalInterface.PredicateInterface;
import hw28.functionalInterface.SupplierInterface;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        PredicateInterface<Double> isIncome = income -> income > 1500.0;
        System.out.println(isIncome.incomeChecker(15555.0));


        ConsumerInterface<String> stringConsumerInterface = (text) -> {

            char[] ar = text.toCharArray();
            for (int i = 0; i < ar.length; i++) {
                System.out.println("Element #" + i + " " + ar[i]);
            }
        };
        stringConsumerInterface.accept("cfdghvbjnkml");

        FunctionInterface<Integer, String> transform = number -> {
            if (number == 1) { return "one"; }
            else if (number == 2) { return "two"; }
            else if (number == 3) { return "three"; }
            else if (number ==4){return "four";}
            else if (number ==5){return "five";}
            else if (number ==6){return "six";}
            else if (number == 7){return "seven";}
            else if (number ==8){return "eight";}
            else if (number == 9){return  "nine";}
            else if (number ==10){return "ten";}
            return "unknown";
        };
        System.out.println(transform.transform(0));

        SupplierInterface<Integer> supplierInterface = () -> new Random().nextInt(1000);
        System.out.println("supplierInterface.get(): " + supplierInterface.get());
        supplierInterface.get();
    }
}