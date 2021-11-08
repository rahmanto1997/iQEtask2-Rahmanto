package Part3OOP.Problem4;

public class harga extends volume{
    public harga(double panjang, double lebar, double tinggi, double berat) {
        super(panjang, lebar, tinggi, berat);
    }
    public harga() {
        super();
    }
    public double ongkoskirim(){
        double hitung = this.hitung();
        double berat = Math.ceil(this.berat);
        if (hitung <= 50 || berat <= 1){
            return 5000.0;
        }else {
            return 10000.0;
        }
    }
}
