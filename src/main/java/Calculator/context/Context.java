package Calculator.context;

public class Context<E> {
    protected E data;

    protected Context(E data) {
        this.data = data;
    }

    public static SingleContext of(String data) {
        return new SingleContext(data);
    }

    public static IntegerArrayContext of(int[] data) {
        return new IntegerArrayContext(data);
    }

    public static StringArrayContext of(String[] data) {
        return new StringArrayContext(data);
    }
}
