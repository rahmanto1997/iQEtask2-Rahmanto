package Part3OOP.Problem4;

public class main {
    public static void main(String[] args) {
        harga b = new harga();
        b.panjang = 5.0;
        b.lebar = 2.0;
        b.tinggi = 4.0;
        b.berat = 1;

        System.out.println("Hitung Volume: "+b.hitung());
        System.out.println("Hitung Ongkir: "+b.ongkoskirim());
    }
}
