package ardhastudio.Application;

import ardhastudio.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Fathar", "Dhabit", "Adz-Dzaky", "Yohan", "Apriyandi", "Fithriya"," Nabilah" };
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

        System.out.println(ArrayHelper.<String>count(names));
        //atau tanpa mendeklarasikan generic type seperti:
        System.out.println(ArrayHelper.count(numbers));
    }
}
