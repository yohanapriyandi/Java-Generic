package ardhastudio.Application;

public class MultipleConstraintApp {
    public static void main(String[] args) {
        // Data<Manager> managerData = new Data<>(new Manager()); // ERROR karena manager tidak implements interface CanSayHello
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());

    }

    // Interface
    public static interface CanSayHello{
        void SayHello(String name);
    }

    public static abstract class Employee{

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Employee implements CanSayHello{

        @Override
        public void SayHello(String name) {
            System.out.println("Hello " + name);

        }
    }
    //example multiple constraint di java extends <Class & Interface & Interface...dst>
    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public Data(T data) {
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
