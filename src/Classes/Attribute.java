package Classes;

public class Attribute {
    int x = 5;
    final int y = 10;

    public static void main(String[] args) {
        ModifyAttributes();
        FinalAttributes();
    }

    public static void ModifyAttributes() {
        Attribute myObj = new Attribute();
        myObj.x = 10;
        System.out.println(myObj.x);
    }

    // If you don't want the ability to override existing values, declare the attribute as final
    public static void FinalAttributes() {
        Attribute finalObj = new Attribute();
        // finalObj.y = 15; // will generate an error: cannot assign a value to a final variable
        // System.out.println(finalObj.x);
    }
}
