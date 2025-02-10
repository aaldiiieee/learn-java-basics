package DataTypes;

/*
TIPE DATA NUMBER
 - Integer Number
 - Floating Point Number
 */

public class NumberDataType {
    public static void main(String[] args) {
        System.out.println("Integer Number: ");
        Number();
        System.out.println("Floating Point Number: ");
        Float();
    }

    /*
    | Type Data | Min                        | Max                       | Size      | Default |
    |-----------|----------------------------|---------------------------|-----------|---------|
    | byte      | -128                       | 127                       | 1 byte    | 0       |
    | short     | -32,768                    | 32,767                    | 2 bytes   | 0       |
    | int       | -2,147,483,648             | 2,147,483,647             | 4 bytes   | 0       |
    | long      | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 | 8 bytes   | 0       |
    */

    public static void Number() {
        byte numByte = 100;
        short numShort = 32_767;
        int numInt = 1_000_000;
        long numLong = 1_000_000_000L;

        System.out.println("byte: " + numByte);
        System.out.println("short: " + numShort);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);

        System.out.println("\n");
    }

    /*
    | Type Data | Min        | Max        | Size    | Default |
    |-----------|------------|------------|---------|---------|
    | float     | 3.4e-038   | 3.4e+038   | 4 bytes | 0.0     |
    | double    | 1.7e-308   | 1.7e+308   | 8 bytes | 0.0     |
    */

    public static void Float() {
        float numFloat = 10.10F;
        double numDouble = 10.10;

        System.out.println("float: " + numFloat);
        System.out.println("double: " + numDouble);

        System.out.println("\n");
    }
}
