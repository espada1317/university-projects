package user;

import chatroom.ChatRoomInterface;

public abstract class User {
    private final ChatRoomInterface mediator;

    private final String id;
    private final String name;

    protected User(ChatRoomInterface room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);

    public ChatRoomInterface getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
