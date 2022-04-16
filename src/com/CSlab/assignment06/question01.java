package com.CSlab.assignment06;

interface Message{
    void create_message(String message);
    void send_message();
    void receive_message();
}

class Text_message implements Message{
    String Message ;
    public void create_message(String message) {
        Message = message;
        System.out.println("Message Created !");
    }
    public void send_message(){
        System.out.println("Message Sent !");
    }
    public void receive_message() {
        System.out.println("Message Received : " + Message);
    }
}

public class question01{
    public static void main(String[] args) {
        Text_message t1 = new Text_message();
        t1.create_message("Hello There !!");
        t1.send_message();
        t1.receive_message();
    }
}