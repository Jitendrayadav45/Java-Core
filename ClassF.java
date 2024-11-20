public class ClassF {

    public static void staticMethodF() {
        System.out.println("Static Method in Class F");
        ClassE obj = new ClassE();
        obj.nonStaticMethodE(); // Calling non-static method from Class E
    }

    public static void main(String[] args) {
        staticMethodF(); // Calling static method in Class F
    }
}
