import java.util.ArrayList;

public class LinkedQueue <T> implements Queue<T>{
    private ArrayList<T> queue = new ArrayList<T>();

    @Override
    public int size() {
        return queue.size() ;
    }

    @Override
    public boolean isEmpty() {
        return queue.size() == 0;
    }

    @Override
    public void enqueue(T t) {
        queue.add(t);
    }

    @Override
    public T dequeue() {
        if (queue.size() !=0) {
            T last = queue.get(queue.size() - 1);
            queue.remove(queue.size() - 1);
            return last;
        }return null;
    }
}
