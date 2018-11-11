package Calculator.context;

public final class StringArrayContext extends Context<String[]> {

    protected StringArrayContext(String[] data) {
        super(data);
    }

    public StringArrayContext trim() {
        String[] ret = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            ret[i] = data[i].trim();
        }

        data = ret;

        return this;
    }

    public IntegerArrayContext toInts() {
        int[] ret = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            ret[i] = Integer.parseInt(data[i]);
        }

        return IntegerArrayContext.of(ret);
    }
}
