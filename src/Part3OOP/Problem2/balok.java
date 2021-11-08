package Part3OOP.Problem2;

public class balok extends bangunruang{
    int panjang;
    int lebar;
    int tinggi;

    public balok (int panjang, int lebar, int tinggi){
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }

    public double volume (){return this.panjang * this.lebar * this.tinggi;}
}
