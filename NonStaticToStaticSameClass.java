public class NonStaticToStaticSameClass {

    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public void nonStaticMethod() {
        System.out.println("Non-Static Method");
        staticMethod(); // Calling static method from non-static method
    }

    public static void main(String[] args) {
        NonStaticToStaticSameClass obj = new NonStaticToStaticSameClass();
        obj.nonStaticMethod(); // Calling non-static method
    }
}
