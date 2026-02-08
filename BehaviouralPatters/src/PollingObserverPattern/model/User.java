package PollingObserverPattern.model;

import java.util.HashSet;

public class User extends Thread {
    Integer userId;
    String username;
    String email;
    HashSet<Message> messages = new HashSet<>();
    ChatRoom chatRoom;
    public User(Integer userId, String username, String email){
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    @Override
    public void run(){
        while(true){
            if(!chatRoom.getMessageQueue().isEmpty()){
                if (!messages.contains(chatRoom.getMessageQueue().peek().getMessage())){
                    messages.add(chatRoom.getMessageQueue().peek().getMessage());
                    chatRoom.addUserPerMessage(chatRoom.getMessageQueue().peek().getMessage());
                }
            }
        }
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.userId = id;
    }

    public HashSet<Message> getMessages() {
        return messages;
    }

    public void setMessages(HashSet<Message> messages) {
        this.messages = messages;
    }

    public void addChatRoom(ChatRoom chatRoom){
        this.chatRoom = chatRoom;
    }
}
