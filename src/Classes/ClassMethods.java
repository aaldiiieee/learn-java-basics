package Classes;

public class ClassMethods {
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method

        ClassMethods callPublicMethod = new ClassMethods(); // Create an object of Main
        callPublicMethod.myPublicMethod(); // Call the public method on the object
    }

    // Static method => Can be called without creating objects
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method => Must be called by creating objects
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}
