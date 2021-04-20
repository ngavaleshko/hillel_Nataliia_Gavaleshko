package hw29;

import hw28.functionalInterface.SupplierInterface;
import hw29.entity.Textile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /**
         * Task 1
         */

        Stream.of()
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

        /**
         * Task 2
         */

        List<String> listOfStrings = List.of(" ", "blue", "purple", "red", "black");
        Set<String> setOfStrings = listOfStrings.stream()
                .filter(val -> val.length() > 3)
                .skip(1)
                .collect(Collectors.toSet());
        setOfStrings.forEach(System.out::println);

        /**
         * Task 3
         */

        Set<String> thirdSet = Set.of("risa", "balloon", "stranger");
        List<String> thirdList = thirdSet.stream()
                .collect(Collectors.toList());
        thirdList.forEach(System.out::println);

        /**
         * Task 4
         */

        Map<String, String> fourthMap = Map.of("Key", "Bob", "Key1", "Charlie", "Key2", "Charlie");
        Collection<String> keySet = fourthMap.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toSet());
        keySet.forEach(System.out::println);

        /**
         * Task 5
         */

        List<String> fifthList = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        Collection<Integer> setOfInteger = fifthList.stream()
                .skip(1)
                .limit(8)
                .map(Integer::parseInt)
                .filter(var -> var % 2 == 0)
                .collect(Collectors.toSet());
        setOfInteger.forEach(System.out::println);

        /**
         * Task 6
         */

        Stream<String> sixthStream = Stream.of("gold", "silver", "bronze", "steel");
        Optional<String> result = sixthStream.parallel()
                .sorted()
                .filter(val -> val.length() < 5)
                .findFirst();
        System.out.println(result.get());


        /**
         * Task 7
         */

        Textile textile = new Textile("Silk");
        Stream.of("cutur","balist", "leather")
                .map(String::toUpperCase)
                .map(String::length)
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::println);
    }
}

