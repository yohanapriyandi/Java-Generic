package ardhastudio;

public class MyData<T> {
    private T data;

    // Constructor
    public MyData(T data) {
        this.data = data;
    }

    // getter
    public T getData() {
        return data;
    }

    //setter
    public void setData(T data) {
        this.data = data;
    }

}
