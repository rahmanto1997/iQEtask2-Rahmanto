package Part3OOP.Problem1;

public class segitiga extends bangundatar{
    int alas;
    int tinggi;

    public  segitiga(int tinggi, int alas){
        this.alas =alas;
        this.tinggi= tinggi;
    }
    public float luas(){
        return this.alas * this.tinggi/2;
    }
    public float keliling(){
        return this.alas*3;
    }
}
