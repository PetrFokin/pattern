package behavior.chainofresponsibility;

public class BasicSecurityControl implements SecurityControl {

    private SecurityControl nextSecurityControl;

    @Override
    public void checkCustomer(Customer customer) {
        if (customer.getBags().stream().anyMatch(Bag.ILLEGAL_THINGS::contains)) {
            nextSecurityControl.checkCustomer(customer);
        }
    }

    public SecurityControl setNext(SecurityControl nextSecurityControl) {
        this.nextSecurityControl = nextSecurityControl;
        return nextSecurityControl;
    }
}
