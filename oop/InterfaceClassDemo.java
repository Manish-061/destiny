package oop;

class Employees{
    void work(){
        System.out.println("Employee Working");
    }
}

interface AttendMeeting{
    void attendMeeting();
}

interface WriteCode{
    void writeCode();
}

class Developer extends Employees 
        implements AttendMeeting, WriteCode{
            @Override
            public void attendMeeting(){
                System.out.println("Attending meeting");
            }

            @Override
            public void writeCode(){
                System.out.println("Writing Code.");
            }
}


public class InterfaceClassDemo {
    public static void main(String[] args) {
        Developer dev = new Developer();

        dev.work();
        dev.attendMeeting();
        dev.writeCode();
    }
}
