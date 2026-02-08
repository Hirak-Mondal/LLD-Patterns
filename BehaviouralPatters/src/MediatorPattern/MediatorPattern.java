package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator{
    void sendMessage(String msg, ChatUser user);
    void addUser(ChatUser use);
}

class ChatRoom implements ChatMediator{

    private List<ChatUser> users;

    public ChatRoom(){
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, ChatUser sender) {
        for(ChatUser user: users){
            if(user != sender){
                user.receiveMessage(msg, sender);
            }
        }
    }

    @Override
    public void addUser(ChatUser user) {
        users.add(user);
    }
}

class ChatUser{
    private final String name;
    private final ChatMediator chatMediator;

    public ChatUser(String name, ChatMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
    }
    public String getName() {
        return name;
    }

    public void sendMessage(String msg){
        System.out.println(this.name + " is sending a message " + msg);
        chatMediator.sendMessage(msg, this);
    }

    public void receiveMessage(String msg, ChatUser sender){
        System.out.println(this.name + " receives a message: " + msg + " from " + sender.getName());
    }
}

public class MediatorPattern {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        ChatUser rahul = new ChatUser("rahul", chatRoom);
        ChatUser amit = new ChatUser("amit", chatRoom);
        ChatUser neha = new ChatUser("neha", chatRoom);

        chatRoom.addUser(rahul);
        chatRoom.addUser(amit);
        chatRoom.addUser(neha);

        rahul.sendMessage("Hello, everyone");

    }
}
/*
//this is a chat room implementation

 */