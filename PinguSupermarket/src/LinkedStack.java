import java.util.ArrayList;

public class LinkedStack <T> implements Stack<T>{


    private ArrayList<T> stack = new ArrayList<T>();

    public LinkedStack(ArrayList<T> stack) {
        this.stack = stack;
    }

    @Override
    public void push(T t) {
        stack.add(t);
    }

    @Override
    public T pop() {
        if (stack.size() > 0 ){
            T shenaxva = stack.get(0);
            stack.remove(0);
            return shenaxva;
        }
        return null;
    }


    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return (stack.size() == 0);
    }
}

