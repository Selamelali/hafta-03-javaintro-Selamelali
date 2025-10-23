public class Faktoriyel {
    public static void main(String[] args) {
        int sayi = 5;
        int faktoriyel = 1;
        System.out.println(sayi + "! hesaplanıyor:");
        for (int i = sayi; i >= 1; i--) {
            System.out.println(i + " × ");
            faktoriyel = faktoriyel * i;
        }
        System.out.println("Sonuç = " + faktoriyel);
    }
}
