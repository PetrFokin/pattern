package structure.adapter;

import java.util.List;

import static java.util.Arrays.asList;

public class Test {

    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        PhoneAdapter iphone = new PhoneAdapter(new Iphone());
        List<Phone> phones = asList(nokia, iphone);
        phones.forEach(Phone::call);
    }
}
