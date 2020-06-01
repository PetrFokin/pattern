package structure.adapter;

public class PhoneAdapter implements Phone {
    private final SmartPhone smartPhone;

    public PhoneAdapter(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }

    @Override
    public void call() {
        smartPhone.call();
    }
}
