public interface DataStructureConnector <T>{
    boolean hasNextElement();
    void addElement(T t);
    T removeNextElement();
}
