package ComparableAndComparatorConceptProblem;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
    int age;
    Student(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }
}
class main{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(18));
        list.add(new Student(25));
        list.add(new Student(30));
        list.add(new Student(21));

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.age);
        }

    }
}
