package user;

import chatroom.ChatRoomInterface;

public class ChatUser extends User{

    public ChatUser(ChatRoomInterface room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " \t\t\t:: Sending Message :\t " + msg);
        getMediator().sendMessage(msg, userId);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " \t\t\t:: Received Message :\t " + msg);
    }
}
