import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input value: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int a = NumberFormatter.parseInt(number);
        System.out.println("parsed value");
        System.out.println(a);
    }
}