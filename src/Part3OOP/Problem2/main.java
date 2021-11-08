package Part3OOP.Problem2;

public class main {
    public static void main(String[] args) {
        bangunruang bangunruang= new bangunruang();
        kubus kubus= new kubus(10);
        balok balok= new balok(3,6,10);
        tabung tabung= new tabung(7,10);

        bangunruang.volume();
        System.out.println("Volume kubus= "+kubus.volume());
        System.out.println("Volume balok= "+balok.volume());
        System.out.println("Volume tabung= "+tabung.volume());
    }
}
