package Operators;

public class ArithmaticOperator {
    /*
    | Operator | Keterangan       |
    |----------|------------------|
    | +        | Penjumlahan      |
    | -        | Pengurangan      |
    | *        | Perkalian        |
    | /        | Pembagian        |
    | %        | Sisa Pembagian   |
    */

    public static void main(String[] args) {
        int a = 100, b = 10;

        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
