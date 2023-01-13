package ardhastudio.Application;

import ardhastudio.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Yohan");
        MyData<Integer> integerMyData = new MyData<Integer>(5);

        String stringValue = stringMyData.getData();
        Integer integerValue  = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
