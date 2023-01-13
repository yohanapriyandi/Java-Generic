package ardhastudio.Application;

import ardhastudio.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Yohan Abiena Fathar");
        process(stringMyData);
    }
                               //covariant
    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());
        // untuk covariant hanya diperbolehkan read only
        // karena apabila kita mengubah data misal dari generic type <String>
        // ke generic type <Integer> maka akan menmyebabkan kerusakan data

        // ****************************
        // sehingga ketika kita melakukan myData.setdata()//ini tidak diperbolehkan
        // ****************************
    }
}
