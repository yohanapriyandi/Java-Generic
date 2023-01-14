package ardhastudio.Application;

import ardhastudio.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("Yohan");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        //integerMyData.setData(100);
        Integer integer = integerMyData.getData();

    }
}
