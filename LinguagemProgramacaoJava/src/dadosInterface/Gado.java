package dadosInterface;

public class Gado implements InterfaceAnimal {


    @Override
    public void animalSom() {
        System.out.println("Muuu");

    }

    @Override
    public void animalComer() {
        System.out.println("Capim!");
    }

    @Override
    public void animalAbrigo() {

        System.out.println("Estrebaria");
    }

    @Override
    public String toString() {
        return "Gado{}";
    }
}
