public class StaticToNonStaticSameClass {

    public void nonStaticMethod() {
        System.out.println("Non-Static Method");
    }

    public static void staticMethod() {
        System.out.println("Static Method");
        StaticToNonStaticSameClass obj = new StaticToNonStaticSameClass();
        obj.nonStaticMethod(); // Calling non-static method from static method
    }

    public static void main(String[] args) {
        staticMethod(); // Calling static method
    }
}
