package Part3OOP.Problem3;

public class main {
    public static void main(String[] args) {
        kalkulator kalkulator = new kalkulator();
        penjumlahan penjumlahan = new penjumlahan(3,4);
        pengurangan pengurangan = new pengurangan(15,4);
        perkalian perkalian = new perkalian(10,10);
        pembagian pembagian = new pembagian(12,3);

        kalkulator.hitung();
        System.out.println("Hitung Penjumlahan: "+penjumlahan.hitung());
        System.out.println("Hitung Pengurangan: "+pengurangan.hitung());
        System.out.println("Hitung Perkalian: "+perkalian.hitung());
        System.out.println("Hitung Pembagian: "+pembagian.hitung());
    }
}
