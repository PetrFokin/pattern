package behavior.iterator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Facebook implements SocialNetwork {

    private final Map<Long, List<Profile>> users = new HashMap<>();

    public void addUser(Long id, List<Profile> profiles) {
        users.put(id, profiles);
    }

    @Override
    public ProfileIterator getIterator(Long id) {
        return new FacebookIterator(this, id);
    }

    public List<Profile> getProfilesById(Long id) {
        return users.get(id);
    }
}
