import java.util.ArrayList;

public class QueueConnector<T> implements DataStructureConnector<T> {
    private Queue<T> daddychill;

    public QueueConnector(Queue<T> daddychill) {
        this.daddychill = daddychill;
    }

    @Override
    public boolean hasNextElement() {
        return !this.daddychill.isEmpty();
    }

    @Override
    public void addElement(T t) {
        this.daddychill.enqueue(t);

    }

    @Override
    public T removeNextElement() {
        if (!this.daddychill.isEmpty()){
            return this.daddychill.dequeue();
        }
        return null;
    }
}
