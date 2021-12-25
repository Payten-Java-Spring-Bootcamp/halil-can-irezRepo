package com.streamapiHomework1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    //Filter
    public static List<Person> _getFemales(List<Person> personList){
        return  personList.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))

                .collect(Collectors.toList());
    }

    //sort
    public static  List<Person> _sortedbyage(List<Person> personList){
        return personList.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());
    }


    // any match , allmatch , nonematch
    public static  boolean _anymatcbygivennumber(List<Person> personList , int givenAge){
        return personList.stream()
                .anyMatch(person -> person.getAge() > givenAge);
    }

    public static  boolean _allmatchbygivennumber(List<Person> personList , int givenAge){
        return personList.stream()
                .allMatch(person -> person.getAge() > givenAge);
    }

    public static  boolean  noneMatch(List<Person> personList , int givenAge){
        return personList.stream()
                .noneMatch(person -> person.getAge() > givenAge);
    }

    // max min
    public  static Optional<Person> maxPerson (List<Person> personList){
        return personList.stream()
                .max(Comparator.comparing(Person::getAge));
    }

    public  static Optional<Person> minPerson (List<Person> personList){
        return personList.stream()
                .min(Comparator.comparing(Person::getAge));
    }

    public  static Optional<String> nameofminPerson (List<Person> personList){
        return personList.stream()
                .min(Comparator.comparing(Person::getAge))
                .map(Person::getName);
    }

    // group by
    public static Map<Gender, List<Person>>  groupbygender(List<Person> personList){
        return  personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
    }

    public static Optional<String> oldestFemaleAge(List<Person> personList){
        return personList.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
    }

    // reduce
    public static Integer reduceage(List<Person> personList){
        return personList.stream().map(Person::getAge).reduce(0,(Integer a ,Integer b )-> a + b );
    }


    // slice
    public static<T> Stream<T> getSlice(Stream<T> stream, int fromIndex, int toIndex)
    {
        return stream
                // specify the total number of elements to skip
                .skip(fromIndex)
                // specify the total number of elements the stream should be limited to
                .limit(toIndex - fromIndex + 1);
    }

    // difference
    public static  List<Person> differences(List<Person> personList1 , List<Person> personList2){
        return personList1.stream()
                .filter(element -> !personList2.contains(element))
                .collect(Collectors.toList());

    }

    // distincit uniq isimleri geri döndermek için kullandım 
    public static List<String> distincit(List<Person> personList){
        return  personList.stream().map(Person::getName)
                .distinct().collect(Collectors.toList());
    }


    public static void main(String[] args) {


        List<Person> persons = getPeople();
        System.out.println(reduceage(persons));
    }



    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
