package structure.facade;

public class DeliveryApp {

    private final BankSystem bankSystem;
    private final LogisticSystem logisticSystem;
    private final OrderSystem orderSystem;

    public DeliveryApp(BankSystem bankSystem, LogisticSystem logisticSystem, OrderSystem orderSystem) {
        this.bankSystem = bankSystem;
        this.logisticSystem = logisticSystem;
        this.orderSystem = orderSystem;
    }

    public Order createOrder() {
        return orderSystem.createOrder();
    }

    public void payForOrder(Order order) {
        bankSystem.pay(order);
    }

    public void processOrder(Order order) {
        orderSystem.processOrder(order);
    }

    public void deliveryOrder(Order order) {
        logisticSystem.deliveryOrder(order);
    }
}
