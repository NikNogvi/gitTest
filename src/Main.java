public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(sum(a,b));
        System.out.println(minus(a,b));
        System.out.println(multiplay(a,b));
    }

    private static int sum (int a, int b) {
        return a + b;
    }

    private static int minus (int a, int b) {
        return a - b;
    }

    private static int multiplay (int a, int b) {
        return a * b;
    }

}