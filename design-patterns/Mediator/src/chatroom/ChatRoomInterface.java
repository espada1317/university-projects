package chatroom;

import user.User;

public interface ChatRoomInterface {
    public void sendMessage(String msg, String userId);
    public void addUser(User user);
}
