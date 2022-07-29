public class PenguinCustomer {
    private String name;
    private int money;
    private Stack<FishyProduct> products;

    public PenguinCustomer(String name, int money, Stack<FishyProduct> products) {
        if (name == null){
            ExceptionUtil.illegalArgument("Name can not be NULL");
        } else if (money<0) {
            ExceptionUtil.illegalArgument("Money Can't be negative ");
        }
        this.name = name;
        this.money = money;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Stack<FishyProduct> getProducts() {
        return products;
    }

    void addProductToBasket(FishyProduct prod ){
        if (prod == null)
            return;
        this.products.push(prod);
    }
    void placeAllProductsOnBand (Queue<FishyProduct> prod){
        if (this.products == null)
            return;
        StackConnector<FishyProduct> first = new StackConnector<>(products);
        QueueConnector<FishyProduct> second = new QueueConnector<>(prod);
        DataStructureLink<FishyProduct> main = new DataStructureLink<>(first,second);
        main.moveAllFromAToB();
    }
    void takeAllProductsFromBand(Queue<FishyProduct> band){
        if (band == null)
            return;
        DataStructureLink<FishyProduct> main = new DataStructureLink<FishyProduct>(new QueueConnector<>(band), new StackConnector<>(products));
    }
    public void pay(int a){
        if(a<0) return;
        if (this.money < a) return;
        else {
            this.money -= a;
        }

    }

    @Override
    public String toString() {
            return ("FishyProduct{" + "name='" + this.name + '\'' + ", money=" + this.money + ", product=" + this.products);

    }

}
