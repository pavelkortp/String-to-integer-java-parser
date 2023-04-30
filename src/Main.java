public class Main {
    public static void main(String[] args) {
        int a = NumberFormatter.parseInt("1234");
        System.out.println(a);
        a = NumberFormatter.parseInt("-1234");
        System.out.println(a);
        a = NumberFormatter.parseInt("+1234");
        System.out.println(a);

        int b = -23;
        String s = NumberFormatter.valueOf(b);
        System.out.println(s);

    }
}