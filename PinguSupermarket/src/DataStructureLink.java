public class DataStructureLink <T> {
    private DataStructureConnector<T> first;
    private DataStructureConnector<T> second;

    public DataStructureLink(DataStructureConnector<T> first, DataStructureConnector<T> second) {
        this.first = first;
        this.second = second;
    }


    boolean moveNextFromAToB(){
        if (first.hasNextElement()){
            second.addElement(first.removeNextElement());
            return true;
        }return false;
    }
    void moveAllFromAToB(){
        while (first.hasNextElement()){
            second.addElement(first.removeNextElement());
        }

    }
}
