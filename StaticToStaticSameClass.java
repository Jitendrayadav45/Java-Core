public class StaticToStaticSameClass {
    
    public static void method1() {
        System.out.println("Static Method 1");
        method2(); // Calling another static method from the same class
    }

    public static void method2() {
        System.out.println("Static Method 2");
    }

    public static void main(String[] args) {
        method1(); // Calling method1 from main
    }
}
