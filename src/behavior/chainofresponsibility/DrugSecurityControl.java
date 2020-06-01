package behavior.chainofresponsibility;

public class DrugSecurityControl implements SecurityControl {

    private SecurityControl nextSecurityControl;

    @Override
    public void checkCustomer(Customer customer) {
        if (customer.getBags().contains(Bag.DRUG))
            throw new IllegalArgumentException("Customer is suspected. Drugs were found!");
        nextSecurityControl.checkCustomer(customer);
    }

    public SecurityControl setNext(SecurityControl nextSecurityControl) {
        this.nextSecurityControl = nextSecurityControl;
        return nextSecurityControl;
    }
}
