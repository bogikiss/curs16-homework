package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonService {
    List<Person> persons = Arrays.asList(
            Person.builder()
                    .firstName("Hannah")
                    .lastName("Williamson")
                    .age(15)
                    .city("Cluj")
                    .build(),
            Person.builder()
                    .firstName("George")
                    .lastName("Williamson")
                    .age(28)
                    .city("Cluj")
                    .build(),
            Person.builder()
                    .firstName("Peter")
                    .lastName("Black")
                    .age(25)
                    .city("Oradea")
                    .build(),
            Person.builder()
                    .firstName("Maria")
                    .lastName("Moore")
                    .age(66)
                    .city("Oradea")
                    .build()
    );

    List<String> allNames = persons.stream()
            .flatMap(e -> Stream.of(e.firstName() + " " + e.lastName()))
            .collect(Collectors.toList());

    List<String> allFirstNames = persons.stream()
            .map(Person::firstName)
            .toList();
    List<String> allLastNames = persons.stream()
            .map(Person::lastName)
            .toList();

    List<Person> majors = persons.stream()
            .filter(person -> person.age() > 18)
            .toList();

    List<Person> fromOradea = persons.stream()
            .filter(person -> person.city().equals("Oradea"))
            .toList();

    List<Person> fromOradeaOrCluj = persons.stream()
            .filter(person -> person.city().equals("Oradea") || person.city().equals("Cluj"))
            .toList();

    List<String> capitalizeFirstNames = allFirstNames.stream()
            .map(String::toUpperCase)
            .collect(Collectors
                    .toList());

    List<String> allNames2 = persons.stream()
            .flatMap(e -> Stream.of(e.firstName() + " " + e.lastName().substring(0, 1) + "."))
            .collect(Collectors.toList());

    List<Person> between18And60 = persons.stream()
            .filter(person -> person.age() > 18 && person.age() < 60)
            .toList();

    List<Person> firstNameStartingWithA = persons.stream()
            .filter(person -> person.firstName().startsWith("A"))
            .toList();

    List<String> uniqueFirstNames = allFirstNames.stream()
            .distinct()
            .toList();

    List<Person> sortByFirstName = persons.stream()
            .sorted(Comparator.comparing(Person::firstName))
            .toList();

    List<Person> sortByLastName = persons.stream()
            .sorted(Comparator.comparing(Person::lastName))
            .toList();

    List<Person> sortedMultipleLevel = persons.stream()
            .sorted(Comparator.comparing(Person::firstName).thenComparing(Person::lastName).thenComparingInt(Person::age))
            .toList();
}
