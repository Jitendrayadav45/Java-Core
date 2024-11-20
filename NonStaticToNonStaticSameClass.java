public class NonStaticToNonStaticSameClass {

    public void method1() {
        System.out.println("Non-Static Method 1");
        method2(); // Calling another non-static method
    }

    public void method2() {
        System.out.println("Non-Static Method 2");
    }

    public static void main(String[] args) {
        NonStaticToNonStaticSameClass obj = new NonStaticToNonStaticSameClass();
        obj.method1(); // Calling non-static method
    }
}
