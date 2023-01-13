package ardhastudio.Application;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> numberData = new NumberData<>(2);
        NumberData<Long> longNumberData = new NumberData<>(1L);

        //NumberData<Boolean> booleanNumberData = new NumberData<Boolean>(false); //ERROR karena tipe data tidak sesuai dengan yang sudah dideklarasikan

        System.out.println(numberData.getData());
        System.out.println(longNumberData.getData());
        //System.out.println(booleanNumberData);
    }

    public static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
