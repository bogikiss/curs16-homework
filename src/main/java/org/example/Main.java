package org.example;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        System.out.println(personService.allFirstNames);
        System.out.println(personService.allLastNames);
        System.out.println(personService.majors);
        System.out.println(personService.fromOradea);
        System.out.println(personService.fromOradeaOrCluj);
        System.out.println(personService.capitalizeFirstNames);
        System.out.println(personService.between18And60);
        System.out.println(personService.firstNameStartingWithA);
        System.out.println(personService.uniqueFirstNames);
        System.out.println(personService.sortByFirstName);
        System.out.println(personService.sortByLastName);
        System.out.println(personService.sortedMultipleLevel);
        System.out.println(personService.allNames);
        System.out.println(personService.allNames2);
    }
}
