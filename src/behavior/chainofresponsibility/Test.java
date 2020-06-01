package behavior.chainofresponsibility;

public class Test {

    public static void main(String[] args) {
        SecurityControl basicSecurityControl = new BasicSecurityControl();
        SecurityControl weaponSecurityControl = new WeaponSecurity();
        SecurityControl drugSecurityControl = new DrugSecurityControl();
        basicSecurityControl.setNext(weaponSecurityControl).setNext(drugSecurityControl);

        Customer honesCustomer = new Customer(Bag.PHONE, Bag.PASSPORT, Bag.WALLET);
        Customer guiltyCustomer = new Customer(Bag.PASSPORT, Bag.WALLET, Bag.PISTOL);
        Customer drugDealer = new Customer(Bag.PASSPORT, Bag.DRUG);

        basicSecurityControl.checkCustomer(honesCustomer);
        basicSecurityControl.checkCustomer(guiltyCustomer);
        basicSecurityControl.checkCustomer(drugDealer);
    }
}
