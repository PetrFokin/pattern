package behavior.chainofresponsibility;

public interface SecurityControl {
    void checkCustomer(Customer customer);
    SecurityControl setNext(SecurityControl nextSecurityControl);
}
