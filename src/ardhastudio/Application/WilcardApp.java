package ardhastudio.Application;

import ardhastudio.MyData;

public class WilcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(1000));
        print(new MyData<String>("Yohan"));
        print(new MyData<Boolean>(true));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));

    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
