package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private int[] numbers = new int[MAX_SIZE];
    public int total = DEF_INDEX_STACK;

    private static final int DEF_INDEX_STACK = -1;
    private static final int NOT_FOUND = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {

        return total == DEF_INDEX_STACK;
    }

    public boolean isFull() {

        return total == MAX_SIZE -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return NOT_FOUND;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }
    // alt + ->/<- pozwala na przełączanie pomiędzy aktywnymi kartami
}
