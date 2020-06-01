package behavior.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class FacebookIterator implements ProfileIterator {

    private final Facebook facebook;
    private final Long profileId;
    private List<Profile> profiles;
    private int currentPosition = 0;

    public FacebookIterator(Facebook facebook, Long profileId) {
        this.facebook = facebook;
        this.profileId = profileId;
    }

    private void init() {
        profiles = facebook.getProfilesById(profileId);
    }

    @Override
    public boolean hasNext() {
        if (profiles == null) {
            init();
        }
        return currentPosition < profiles.size();
    }

    @Override
    public Profile next() {
        if (hasNext()) {
            Profile profile = profiles.get(currentPosition);
            currentPosition++;
            return profile;
        }

        throw new NoSuchElementException();
    }
}
