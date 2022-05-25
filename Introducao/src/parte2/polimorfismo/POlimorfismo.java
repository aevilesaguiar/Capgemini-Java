package parte2.polimorfismo;

public class POlimorfismo {
    public static void main(String[] args) {
        Mamifero mamifero1=new Elefante();

        System.out.println("Cota diaria de leite de um elefante: "+  mamifero1.cotaDiariaLeite());

        Mamifero mamifero2= new Vaca();
        System.out.println("Cota diaria de leite de uma Vaca: "+  mamifero2.cotaDiariaLeite());





    }
}
