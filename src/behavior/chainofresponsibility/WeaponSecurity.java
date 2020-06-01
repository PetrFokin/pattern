package behavior.chainofresponsibility;

public class WeaponSecurity implements SecurityControl {

    private SecurityControl securityControl;

    @Override
    public void checkCustomer(Customer customer) {
        if (customer.getBags().stream().anyMatch(Bag.WEAPONS::contains))
            throw new IllegalArgumentException("Customer is suspected. Weapon was found!");
        securityControl.checkCustomer(customer);
    }

    @Override
    public SecurityControl setNext(SecurityControl nextSecurityControl) {
        this.securityControl = nextSecurityControl;
        return nextSecurityControl;
    }
}
