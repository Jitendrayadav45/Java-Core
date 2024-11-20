public class ClassB {

    public static void staticMethodB() {
        System.out.println("Static Method in Class B");
        ClassA.staticMethodA(); // Calling static method from Class A
    }

    public static void main(String[] args) {
        staticMethodB(); // Calling static method in Class B
    }
}
