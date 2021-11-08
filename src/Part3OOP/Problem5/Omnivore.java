package Part3OOP.Problem5;

public class Omnivore extends Animal{
    String makanan = "semua";
    String gigi = "tajam dan tumpul";

    public Omnivore(){
        super();
    }

    public Omnivore(String nama){
        super(nama);
    }

    public Omnivore(String nama, String jenismakan, String gigi){
        super(nama, jenismakan, gigi);
    }

    public void identifyMyself(){
        System.out.println("Hi, I'm Omnivore. My name is "+this.nama+". My Food is "+
                this.jenismakanan+", I have "+this.gigi+" teeth.");
    }
}
