package Classes;

public class Object {
    int x = 10;

    public static void main(String[] args) {
        CallObject();
        CallMultipleObjects();
    }

    public static void CallObject() {
        Object myObj = new Object();
        System.out.println(myObj.x);
    }

    public static void CallMultipleObjects() {
        Object myObj1 = new Object();
        Object myObj2 = new Object();
        Object myObj3 = new Object();

        System.out.println("myObj1: " + myObj1.x);
        System.out.println("myObj2: " + myObj2.x);
        System.out.println("myObj3: " + myObj3.x);
    }
}
