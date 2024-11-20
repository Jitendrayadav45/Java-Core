public class ClassH {

    public void nonStaticMethodH() {
        System.out.println("Non-Static Method in Class H");
        ClassG obj = new ClassG();
        obj.nonStaticMethodG(); // Calling non-static method from Class G
    }

    public static void main(String[] args) {
        ClassH obj = new ClassH();
        obj.nonStaticMethodH(); // Calling non-static method in Class H
    }
}
