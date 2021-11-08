package Part3OOP.Problem3;

public class pengurangan extends kalkulator{
    double x;
    double y;

    public pengurangan (double x, double y){
        this.x = x;
        this.y = y;
    }
    public double hitung(){
        return this.x - this.y;
    }

}