public class UcgenHeron {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        double s = (a + b + c) / 2.0;                        // yarı çevre
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));  // A = √[s(s-a)(s-b)(s-c)]

        System.out.println("Kenarlar : a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Yarı çevre (s) : " + s);
        System.out.println("Alan : " + alan);
    }
}
