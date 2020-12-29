package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer();
        JavaDeveloper javaDeveloper1 = new JavaDeveloper();
        Developer developer2 = javaDeveloper1;
        developer2.writeCode();
        javaDeveloper1.createJavaProject();
        doCode(javaDeveloper1);
    }

    public static void doCode(Developer developer){
        developer.writeCode();
    }
}
