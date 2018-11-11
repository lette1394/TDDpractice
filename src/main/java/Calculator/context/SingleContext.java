package Calculator.context;

public final class SingleContext extends Context<String> {
    protected SingleContext(String data) {
        super(data);
    }

    public StringArrayContext split(String delimiter) {
        return StringArrayContext.of(data.split(delimiter));
    }
}
