package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

//        Activity 4: Even and Greater Than Five
        List<Integer> toSortArray = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven = s->s%2==0;
        Predicate<Integer> greaterThanFive = s -> s>5;
        Predicate<Integer> isEvenAndGreaterThanFive = isEven.and(greaterThanFive);
        List<Integer> filteredArray = toSortArray.stream().filter(isEvenAndGreaterThanFive).toList();
        System.out.println(filteredArray);

        //    Activity 5: Sort Objects Using Comparator
        List<Person> personList = Arrays.asList(
                new Person("Nick",800),
                new Person("James", 18),
                new Person("Shaquille",35),
                new Person("Kanye",60),
                new Person("Michael Jordan",45)
        );
//    Sort by Age (Ascending Order)
//    Sort by Name (Alphabetical Order)
//    Sort by Age (Descending Order)
        Comparator<Person> ascendingAge = (p1,p2) -> p1.getAge() - p2.getAge();
        Comparator<Person> descendingAge = (p1,p2)-> p2.getAge() - p1.getAge();
        System.out.println("Sorted by age (ascending): "+personList.stream().sorted(ascendingAge).toList());
        System.out.println("Sorted by name (alphabetical):"+personList.stream().sorted(Comparator.comparing(Person::getName)).toList());
        System.out.println("Sorted by age (descending): "+personList.stream().sorted(descendingAge).toList());
    }
}
