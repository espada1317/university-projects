package user;

import chatroom.ChatRoom;
import chatroom.ChatRoomInterface;

import java.util.Objects;

public class ChatAdministrator extends User{

    public ChatAdministrator(ChatRoomInterface room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " \t\t\t:: Sending Message :\t " + msg);

        if(Objects.equals(getId(), userId))
        {
            for(String key: ChatRoom.getUsersMap().keySet()) {
                if(!Objects.equals(key, userId))
                {
                    getMediator().sendMessage(msg, key);
                }
            }
        } else {
            getMediator().sendMessage(msg, userId);
        }
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " \t\t\t:: Received Message :\t " + msg);
    }
}
