package Part3OOP.Problem2;

public class tabung extends bangunruang{
    float jari;
    float tinggi;

    public tabung(float jari, float tinggi){
        this.jari=jari;
        this.tinggi=tinggi;
    }
    public double volume(){
        return (3.14 * this.jari * this.jari * this.tinggi);
    }
}
