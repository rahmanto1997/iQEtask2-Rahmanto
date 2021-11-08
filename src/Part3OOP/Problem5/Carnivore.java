package Part3OOP.Problem5;

public class Carnivore extends Animal {
    String jenismakanan = "daging";
    String gigi = "tajam";

    public Carnivore(){
        super();
    }

    public Carnivore(String nama){
        super(nama);
    }

    public Carnivore(String nama, String jenismakanan, String gigi){
        super(nama, jenismakanan, gigi);
    }

    public void identifyMyself(){
        System.out.println("Hi, I'm Carnivore. My name is "+this.nama+". My Food is "+
                            this.jenismakanan+", I have "+this.gigi+" teeth");
    }
}
