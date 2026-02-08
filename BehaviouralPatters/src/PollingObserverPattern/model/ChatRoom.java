package PollingObserverPattern.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ChatRoom {

    class Pair{
        Integer offset;
        Message message;

        public Pair(Integer offset, Message message) {
            this.offset = offset;
            this.message = message;
        }

        public Integer getOffset() {
            return offset;
        }

        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }
    }

    int id;
    String name;
    Queue<Pair> messageQueue;
    List<User> users;
    HashMap<Message,Integer> countOfUserPerMessage;
    int offSetVal = 0;

    public void addUserPerMessage(Message message){
        if(countOfUserPerMessage.get(message) == users.size())
            messageQueue.poll();
            countOfUserPerMessage.put(message,countOfUserPerMessage.get(message) + 1);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Queue<Pair> getMessageQueue() {
        return messageQueue;
    }

    public void setMessageQueue(Queue<Pair> messageQueue) {
        this.messageQueue = messageQueue;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addMessage(Message message, User user){
        messageQueue.add(new Pair(offSetVal,message));
        offSetVal++;
    }
}
