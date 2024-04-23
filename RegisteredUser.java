import java.util.HashMap;
import java.util.Map;

public class RegisteredUser {
    private Map<String, User> userMap = new HashMap<String, User>();

    public void addUser(User user) {
        userMap.put(user.getUserID(), user);
    }
    public boolean removeUser(User user) {
        if (userMap.get(user.getUserID()) == null) {
            return false;
        } else {
            userMap.remove(user.getUserID(), user);
            return true;
        }
    }
}
