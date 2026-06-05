package oop;

class StudentDC{
    String name;
    int age;

    StudentDC(){
        System.out.println("Default Constructor");
        name = "Manish";
        age = 22;
    }

    void displayStudentDetails(){
        System.out.println(name + " " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        StudentDC st = new StudentDC();

        st.displayStudentDetails();
    }
}


// Keep the Source file name conflict in check.