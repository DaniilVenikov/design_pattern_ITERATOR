import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int min = 90;
        int max = 100;

        for (int r : new Randoms(min, max)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
