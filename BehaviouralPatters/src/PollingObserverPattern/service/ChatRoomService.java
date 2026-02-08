package PollingObserverPattern.service;

import PollingObserverPattern.model.ChatRoom;
import PollingObserverPattern.model.Message;
import PollingObserverPattern.model.User;

public class ChatRoomService {
    ChatRoom chatRoom;

    public void addUser(){
        System.out.println("User added");
    }

    public void sendMessage(User user, Message message){
        chatRoom.addMessage(message, user);

    }
}
