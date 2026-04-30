
public class Box<T> {
    private T value;
    public void set(T value){ this.value = value; }
    public T get(){ return value; }

    public static void main(String[] args) {
        Box<Integer> b = new Box<>();
        b.set(10);
        System.out.println(b.get());
    }
}
