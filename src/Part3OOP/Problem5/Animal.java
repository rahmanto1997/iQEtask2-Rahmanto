package Part3OOP.Problem5;

public class Animal {
    String nama = "Binatang";
    String jenismakanan;
    String gigi;

    public Animal(){
    }

    public Animal(String Nama){
        this.nama = nama;
    }

    public Animal(String nama, String jenismakanan, String gigi){
        this.nama = nama;
        this.jenismakanan = jenismakanan;
        this.gigi = gigi;
    }

    public void identifyMyself(){
        System.out.println("Hi, I'm Parent of all animal. My name is "+this.nama);
    }
}