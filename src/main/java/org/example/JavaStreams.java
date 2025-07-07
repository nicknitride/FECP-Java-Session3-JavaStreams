package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreams {
    public static void main(String[] args){
//        !Activity 1: Print odd numbers from 1 to 10
        List<Integer> oneToTen = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isOdd = s -> s%2!=0;
        List<Integer> oddOneToTen = oneToTen.stream().filter(isOdd).toList();
        System.out.println(oddOneToTen);


//        Activity 2: Filters starting with 'A'
        List<String> startsWithAArray = Arrays.asList("Alice", "Adam", "Bob", "Angela", "Brian");
        Predicate<String> startsWithA = s->(s.startsWith("A") || s.startsWith("a"));
        List<String> startsWithAOutput = startsWithAArray.stream().filter(startsWithA).toList();
        System.out.println(startsWithAOutput);
//        Activity 3: Square all numbers
        List<Integer> squareArray = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredArray = squareArray.stream().map(num -> num*num).toList();
        System.out.println(squaredArray);

//        Activity 4:
        List<Integer> toSortArray = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven = s->s%2==0;
        Predicate<Integer> greaterThanFive = s -> s>5;
        List<Integer> filteredArray = toSortArray.stream().filter(num -> isEven.test(num)
                && greaterThanFive.test(num)).toList();
        System.out.println(filteredArray);
    }
}
