public class ClassD {

    public void nonStaticMethod() {
        System.out.println("Non-Static Method in Class D");
        ClassC.staticMethodC(); // Calling static method from Class C
    }

    public static void main(String[] args) {
        ClassD obj = new ClassD();
        obj.nonStaticMethod(); // Calling non-static method
    }
}
