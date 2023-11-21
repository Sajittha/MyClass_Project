package MyClass_Project;
public class MyClass {
    // Fields
    private int field1;
    private String field2;
    private double field3;

    // Constructors
    public MyClass() {
        // Default constructor
    }

    public MyClass(int field1, String field2, double field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public MyClass(String field2, double field3) {
        // Constructor overloading
        this.field2 = field2;
        this.field3 = field3;
    }

    public MyClass(int field1) {
        // Constructor overloading
        this.field1 = field1;
    }

    // Methods
    public void method1() {
        // Method 1
        System.out.println("Method 1");
    }

    public void method2(int param) {
        // Method 2
        System.out.println("Method 2 with parameter: " + param);
    }

    public void method3(String param1, int param2) {
        // Method 3
        System.out.println("Method 3 with parameters: " + param1 + ", " + param2);
    }

    // Method overloading
    public void method3(String param1) {
        System.out.println("Method 3 with one parameter: " + param1);
    }

    // Getter and Setter methods
    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public double getField3() {
        return field3;
    }

    public void setField3(double field3) {
        this.field3 = field3;
    }

    public static void main(String[] args) {
        // Create objects of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(10, "Hello", 3.14);
        MyClass obj3 = new MyClass("World", 2.71);
        MyClass obj4 = new MyClass(42);

        // Accessing methods
        obj1.method1();
        obj2.method2(5);
        obj3.method3("Parameter", 7);
        obj4.method3("Single Parameter");

        // Using getter and setter
        obj1.setField1(100);
        System.out.println("Field 1: " + obj1.getField1());

        obj2.setField2("New Value");
        System.out.println("Field 2: " + obj2.getField2());

        obj3.setField3(1.23);
        System.out.println("Field 3: " + obj3.getField3());
    }

}
