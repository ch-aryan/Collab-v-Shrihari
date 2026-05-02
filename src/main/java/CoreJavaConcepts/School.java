package CoreJavaConcepts;

import java.util.ArrayList;
class Student{
    private int age;
    private String name;
    Student(int age,String name){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}

class School {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student s) {
        students.add(s);
    }

    void displayStudents() {
        for(Student s : students) {
            System.out.println("Name is " + s.getName() +" and " +"age is  "+ s.getAge());
        }
    }

    public static void main(String[] args) {
        School s = new School();
        s.addStudent(new Student(20, "Rohan"));
        s.addStudent(new Student(25, "Aashish"));
        s.addStudent(new Student(22, "Neha"));

        // ✅ Display students
        s.displayStudents();

    }
}