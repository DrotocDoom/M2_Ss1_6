import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vận tốc: ");
        float speed = scanner.nextFloat();
        System.out.print("Thời gian: ");
        float time = scanner.nextFloat();
        float distance = speed * time;
        System.out.println("Quảng đường: " + distance);
    }
}
