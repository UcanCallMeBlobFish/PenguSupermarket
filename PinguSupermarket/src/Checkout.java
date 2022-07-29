public class Checkout {
    private Queue<PenguinCustomer> queue;
    private Queue<FishyProduct> bandbeforecashier;
    private Queue<FishyProduct> bandaftercashier;

    public Checkout() {
        this.queue = new LinkedQueue<>();
        this.bandbeforecashier = new LinkedQueue<>();
        this.bandaftercashier = new LinkedQueue<>();
    }

    public Queue<PenguinCustomer> getQueue() {
        return queue;
    }

    public Queue<FishyProduct> getBandbeforecashier() {
        return bandbeforecashier;
    }

    public Queue<FishyProduct> getBandaftercashier() {
        return bandaftercashier;
    }

    public int queueLength() {
        return queue.size();
    }

    public void serveNextCustomer() {
        PenguinCustomer products = queue.dequeue();
        products.placeAllProductsOnBand(bandaftercashier);
        int price = 0;
        while (bandbeforecashier.size() != 0) {
            FishyProduct sht = bandaftercashier.dequeue();
            price += sht.getPrice();
            bandbeforecashier.enqueue(sht);
        }
        products.pay(price);
    }
    @Override
    public String
    toString() {
        return "Checkout{" +
                "Queue=" + queue + ", BandBeforeCashier=" + bandbeforecashier +
                ", BandAfterCashier=" + bandaftercashier +
                '}';
    }

}

