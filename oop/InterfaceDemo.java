package oop;

interface Notification{
    void send();

    // Default Method
    default void insideInterface(){
        System.out.println("Inside Interface, Default method");
    }
}

class EmailNotification implements Notification{
    @Override
    public void send(){
        System.out.println("Notification via Email");
    }
}

class SmsNotification implements Notification{
    @Override
    public void send(){
        System.out.println("Notification via SMS");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new SmsNotification();

        n1.send();
        n2.send();

        n1.insideInterface();

    }    
}
