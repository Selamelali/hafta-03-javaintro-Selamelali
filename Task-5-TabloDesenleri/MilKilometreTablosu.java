public class MilToKm {
    public static void main(String[] args) {
        System.out.println("Mil\tKilometre");
        System.out.println("-----------------");
        for (int mil = 1; mil <= 50; mil *= 2) {
            double km = mil * 1.609344;
            System.out.printf("%d\t%.4f\n", mil, km);
        }
    }
}
