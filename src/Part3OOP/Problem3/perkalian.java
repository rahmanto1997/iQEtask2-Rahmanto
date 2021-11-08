package Part3OOP.Problem3;

public class perkalian extends kalkulator{
    double x;
    double y;

    public perkalian (double x, double y){
        this.x = x;
        this.y = y;
    }
    public double hitung(){
        return this.x * this.y;
    }

}