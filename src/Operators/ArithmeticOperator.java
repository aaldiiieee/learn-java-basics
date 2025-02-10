package Operators;

public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println("Operators:");
        Operators();
        System.out.println("\n");
        System.out.println("Augmented Assignments:");
        AugmentedAssignments();
    }

    /*
    | Operator | Keterangan       |
    |----------|------------------|
    | +        | Penjumlahan      |
    | -        | Pengurangan      |
    | *        | Perkalian        |
    | /        | Pembagian        |
    | %        | Sisa Pembagian   |
    */

    public static void Operators() {
        int a = 100, b = 10;

        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }

    /*
    | Operasi Matematika | Augmented Assignments |
    |--------------------|-----------------------|
    | a = a + 10         | a += 10               |
    | a = a - 10         | a -= 10               |
    | a = a * 10         | a *= 10               |
    | a = a / 10         | a /= 10               |
    | a = a % 10         | a %= 10               |
    */

    public static void AugmentedAssignments() {
        int a = 100;

        a += 10;
        System.out.println(a);

        a -= 10;
        System.out.println(a);

        a *= 10;
        System.out.println(a);

        a /= 10;
        System.out.println(a);

        a %= 10;
        System.out.println(a);
    }
}
