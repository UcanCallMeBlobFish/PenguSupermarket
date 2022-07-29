public class PenguinSupermarket {
    private Checkout[] list;

    public PenguinSupermarket(Checkout[] list) {
        if (list.length <= 0) {
            ExceptionUtil.illegalArgument("Must be greater than 0");
        }

        this.list = list;
    }

    public Checkout[] getCheckouts() {
        return list;
    }
    public Checkout getCheckoutWithSmallestQueue(){
        int compare = -10;
        Checkout t = list[0];
        for (int i =0; i< list.length; i++){
            if (list[i].queueLength() > compare  ){
                compare = list[i].queueLength();
                t = list[i];
            }
        }return t;

    }
}
