package Part3OOP.Problem5;

public class Herbivore extends Animal {
    String jenismakanan = "tumbuhan";
    String gigi = "tumpul";

    public Herbivore(){
        super();
    }

    public Herbivore(String nama){
        super(nama);
    }

    public Herbivore(String nama, String jenismakanan, String gigi){
        super(nama, jenismakanan, gigi);
    }

    public void identifyMyself(){
        System.out.println("Hi, I'm Herbivore. My name is "+this.nama+". My Food is "+
                            this.jenismakanan+", I have "+this.gigi+" teeth.");
    }
}
