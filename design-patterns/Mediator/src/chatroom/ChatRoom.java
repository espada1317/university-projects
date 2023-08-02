package chatroom;

import user.User;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements ChatRoomInterface{

    private static final Map<String, User> usersMap = new HashMap<>();

    public static Map<String, User> getUsersMap() {
        return usersMap;
    }

    @Override
    public void sendMessage(String msg, String userId) {
        User u = usersMap.get(userId);
        u.receive(msg);
    }

    @Override
    public void addUser(User user) {
        usersMap.put(user.getId(), user);
    }
}
