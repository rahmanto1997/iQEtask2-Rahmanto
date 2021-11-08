package Part3OOP.Problem1;

public class main {
    public static void main(String[] args) {
        bangundatar bangundatar= new bangundatar();
        // Memasukkan input sisi persegi
        persegi persegi= new persegi(4);
        // Memasukkan input alas dan tinggi segitiga
        segitiga segitiga= new segitiga(3,4);
        // Memasukkan input panjang dan lebar persegi panjang
        persegipanjang persegipanjang= new persegipanjang(7,8);

        bangundatar.luas();
        bangundatar.keliling();

        System.out.println("Luas Persegi :"+ persegi.luas());
        System.out.println("Keliling Persegi :"+ persegi.keliling());
        System.out.println("Luas segitiga :"+ segitiga.luas());
        System.out.println("Keliling Segitiga :"+ segitiga.keliling());
        System.out.println("Luas Persegi Panjang :"+ persegipanjang.luas());
        System.out.println("Keliling Persegi Panjang :"+ persegipanjang.keliling());
    }
}
