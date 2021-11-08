package Part3OOP.Problem4;

public class volume extends ongkir{
    double panjang;
    double lebar;
    double tinggi;
    double berat;

    public volume (double panjang, double lebar, double tinggi, double berat){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public volume() {
    }

    public double hitung(){
        return (this.panjang * this.lebar * this.tinggi);
    }
}