package Inheritance;

public class Student extends Person{
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    void talk() {
        super.talk();
    }
}
