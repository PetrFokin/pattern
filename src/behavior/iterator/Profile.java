package behavior.iterator;

public class Profile {

    private final Long id;
    private final String name;

    public Profile(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                '}';
    }
}
