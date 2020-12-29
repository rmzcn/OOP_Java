package Polymorphism;

public class JavaDeveloper extends Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writing code");
    }

    public void createJavaProject(){
        System.out.println("Java developer creating java project");
    }
}
