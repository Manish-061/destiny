package oop;

class Student{
    private String name;
    private int age;

    // getters and setters can be used to achieve encapsulation

    // set the name using setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }


    // // displaying the info
    // void displayStudentDetails(){
    //     System.out.println(name + " " + age);
    // }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Manish");
        st.setAge(22);

        System.out.println(st.getName() + " " + st.getAge());

        // st.displayStudentDetails();
    }    
}
