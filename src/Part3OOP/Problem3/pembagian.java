package Part3OOP.Problem3;

public class pembagian extends kalkulator{
    double x;
    double y;

    public pembagian (double x, double y){
        this.x = x;
        this.y = y;
    }
    public double hitung(){
        return this.x / this.y;
    }
}