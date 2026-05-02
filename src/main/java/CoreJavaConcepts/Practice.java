package CoreJavaConcepts;

public class Practice {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Practice(){

    }

    void display() {
        System.out.println("age is : " + age);
        System.out.println("name is : " + name);

    }

    public static void main(String[] args) {
        Practice p = new Practice();
        p.setName("Aashish");
        p.setAge(25);
        p.display();

    }

}
