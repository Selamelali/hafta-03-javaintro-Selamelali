public class UsluTablo {
    public static void main(String[] args) {
        System.out.println("a   a^2   a^3");
        System.out.println("-----------------");

        for (int a = 1; a <= 5; a++) {
            System.out.println(a + "    " + (a*a) + "     " + (a*a*a));
        }
    }
}
