package ardhastudio.Application;

import ardhastudio.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] peoples = {
          new Person("Yohan", "Kuningan"),
          new Person("Nabilah", "Kuningan"),
          new Person("Fathar", "Kuningan"),
        };

        Arrays.sort(peoples);

        System.out.println(Arrays.toString(peoples));
    }
}
