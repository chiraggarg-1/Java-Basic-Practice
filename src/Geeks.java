public class Geeks {
    static void printInFormat(float a, float b) {
        float result = a / b;
        System.out.format("%.3f", result);
    }

    public static void main(String[] args) {
        printInFormat(5.43f, 2.653f);

    }
}

