class Order implements Runnable {
    int id;
    String restaurant;
    int deliveryTime;

    public Order(int id, String restaurant, int deliveryTime) {
        this.id = id;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {
        try {
            System.out.println("Order " + id + " from " + restaurant + " picked up by "
                    + Thread.currentThread().getName());
            Thread.sleep(deliveryTime * 1000);

            System.out.println("Order " + id + " In Transit...");
            Thread.sleep(deliveryTime * 1000);

            System.out.println("Order " + id + " Delivered by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Order(1, "KFC", 2));
        Thread t2 = new Thread(new Order(2, "Dominos", 3));
        Thread t3 = new Thread(new Order(3, "Burger King", 1));
        Thread t4 = new Thread(new Order(4, "Pizza Hut", 2));
        Thread t5 = new Thread(new Order(5, "McDonalds", 4));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(5);
        t5.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
