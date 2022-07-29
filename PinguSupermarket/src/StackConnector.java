public class StackConnector <T> implements DataStructureConnector<T> {
    private  Stack<T> chill;

    public StackConnector(Stack<T> chill) {
        this.chill = chill;
    }

    @Override
    public boolean hasNextElement() {
        return this.chill.isEmpty();
    }

    @Override
    public void addElement(T t) {
        this.chill.push(t);

    }

    @Override
    public T removeNextElement() {
        if (!this.chill.isEmpty()) {
           return this.chill.pop();
        }return null;
    }
}
