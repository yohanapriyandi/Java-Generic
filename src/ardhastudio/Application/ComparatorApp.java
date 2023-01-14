package ardhastudio.Application;

import ardhastudio.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] peoples = {
                new Person("Yohan", "Kuningan"),
                new Person("Nabilah", "Kuningan"),
                new Person("Fathar", "Kuningan"),
        };
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                 return  o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(peoples, comparator);

        System.out.println(Arrays.toString(peoples));
    }
}
