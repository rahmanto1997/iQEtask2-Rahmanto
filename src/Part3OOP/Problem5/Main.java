package Part3OOP.Problem5;

public class Main {
    public static void main(String[] args) {
        Animal Animal = new Animal("Nenek Moyang Hewan");
        Animal.identifyMyself();

        Carnivore Carnivore = new Carnivore("Singa");
        Herbivore Herbivore = new Herbivore("Kambing");
        Omnivore Omnivore = new Omnivore("Ayam");

        Carnivore.identifyMyself();
        Herbivore.identifyMyself();
        Omnivore.identifyMyself();
    }
}
