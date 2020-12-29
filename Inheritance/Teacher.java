package Inheritance;

public class Teacher extends Person {
    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    void talk() {
        super.talk();
    }
}
