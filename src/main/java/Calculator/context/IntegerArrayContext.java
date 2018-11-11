package Calculator.context;

public final class IntegerArrayContext extends Context<int[]> {
    protected IntegerArrayContext(int[] data) {
        super(data);
    }

    public int sum() {
        int sum = 0;

        for (int num : data) {
            sum += num;
        }

        return sum;
    }
}
