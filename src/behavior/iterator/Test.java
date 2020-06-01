package behavior.iterator;

import static java.util.Arrays.asList;

public class Test {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.addUser(1L, asList(new Profile(2L, "Dora"), new Profile(3L, "Andrew")));
        facebook.addUser(2L, asList(new Profile(1L, "Borat")));
        ProfileIterator iterator = facebook.getIterator(1L);
        for (;iterator.hasNext();)
            System.out.println(iterator.next());
    }
}
