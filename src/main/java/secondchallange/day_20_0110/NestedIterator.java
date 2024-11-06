package secondchallange.day_20_0110;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {

    private Deque<Integer> stack = new ArrayDeque<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = init(nestedList);
    }

    private Deque<Integer> init(List<NestedInteger> nestedList) {
        for (var nested : nestedList) {
            if (nested.isInteger()) {
                stack.push(nested.getInteger());
            } else {
                init(nested.getList());
            }
        }
        return stack;
    }

    @Override
    public Integer next() {
        return stack.pollLast();
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

