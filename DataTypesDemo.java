public class DataTypesDemo {

    // Instance variables (default values for class level)
    byte byteVar;          // Default value 0
    short shortVar;        // Default value 0
    int intVar;            // Default value 0
    long longVar;          // Default value 0L
    float floatVar;        // Default value 0.0f
    double doubleVar;      // Default value 0.0d
    char charVar;          // Default value '\u0000' (null character)
    boolean booleanVar;    // Default value false

    public static void main(String[] args) {
        DataTypesDemo data = new DataTypesDemo();

        // Print default values
        System.out.println("Default Values:");
        System.out.println("byte: " + data.byteVar);
        System.out.println("short: " + data.shortVar);
        System.out.println("int: " + data.intVar);
        System.out.println("long: " + data.longVar);
        System.out.println("float: " + data.floatVar);
        System.out.println("double: " + data.doubleVar);
        System.out.println("char: [" + data.charVar + "]");
        System.out.println("boolean: " + data.booleanVar);

        // Assign new values
        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 10000L;
        float floatVar = 10.5f;
        double doubleVar = 20.123;
        char charVar = 'A';
        boolean booleanVar = true;

        // Print assigned values
        System.out.println("\nAssigned Values:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);
    }
}
