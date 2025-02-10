package Condition;

public class SwitchStatement {
    public static void main(String[] args) {
        BasicSwitch();
        SwitchWithYield();
        SwitchLambda();
    }

    public class Value {
        public static String nilai = "A";
        public static String ucapan;
    }

    public static void BasicSwitch() {
        switch (Value.nilai) {
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda tidak punya nilai");
                break;
        }
    }

    public static void SwitchWithYield() {
        String ucapan = Value.ucapan;
        String nilai = Value.nilai;

        ucapan = switch (nilai) {
            case "A":
                yield "Anda lulus dengan baik";
            default:
                yield "anda salah jurusan";
        };

        System.out.println("With yield -> " + ucapan);
    }

    public static void SwitchLambda() {
        String ucapan = Value.ucapan;
        String nilai = Value.nilai;

        switch (nilai) {
            case "A" -> ucapan = "Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Anda lulus";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Anda salah jurusan";
        }
        System.out.println("With lambda -> " + ucapan);
    }
}
