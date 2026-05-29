package ComparableAndComparatorConceptProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student2 {
    int age;
    Student2(int age ){
        this.age = age;
    }
}
class AgeComparator implements Comparator<Student2>{


    @Override
    public int compare(Student2 s1, Student2 s2) {
        return s1.age-s2.age;
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        list.add(new Student2(18));
        list.add(new Student2(25));
        list.add(new Student2(30));
        list.add(new Student2(21));

        Collections.sort(list,new AgeComparator());

        for(Student2 s : list){
            System.out.println(s.age);
        }


    }
}
