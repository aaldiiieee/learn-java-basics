package Method;

public class BasicMethod {
    public static void main(String[] args) {
        findEvenOdd(8);
    }

    public static int findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " Is even");
        } else {
            System.out.println(num + " Is odd");
        }

        return num;
    }
}
