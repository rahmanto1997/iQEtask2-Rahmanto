package Part3OOP.Problem1;

public class persegipanjang extends bangundatar{
    int panjang;
    int lebar;

    public persegipanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public float luas(){
        return this.panjang * this.lebar;
    }
    public float keliling(){
        return (this.panjang+this.lebar)*2;
    }
}
