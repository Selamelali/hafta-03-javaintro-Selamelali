public class HesapOzeti {
    public static void main(String[] args) {
        String[] urunler = {"Elma", "Armut", "Muz"};
        int[] miktarlar = {3, 2, 5};
        double[] fiyatlar = {5.0, 4.5, 3.0};
        
        System.out.println("Ürün\tMiktar\tFiyat\tToplam");
        System.out.println("--------------------------------");
        
        double toplam = 0;
        for (int i = 0; i < urunler.length; i++) {
            double urunToplam = miktarlar[i] * fiyatlar[i];
            toplam += urunToplam;
            System.out.printf("%s\t%d\t%.2f\t%.2f\n", urunler[i], miktarlar[i], fiyatlar[i], urunToplam);
        }
        
        System.out.println("--------------------------------");
        System.out.printf("Genel Toplam: %.2f\n", toplam);
    }
}
