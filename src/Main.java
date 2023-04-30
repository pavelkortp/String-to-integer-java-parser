public class Main {
    public static void main(String[] args) {
        int a = NumberFormatter.parseInt("1234");
        System.out.println(a);
        a = NumberFormatter.parseInt("-1234");
        System.out.println(a);
        a = NumberFormatter.parseInt("+1234");
        System.out.println(a);
    }
}