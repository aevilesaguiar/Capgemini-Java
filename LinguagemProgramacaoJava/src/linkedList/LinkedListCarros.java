package linkedList;
import java.util.LinkedList;


public class LinkedListCarros {
    public static void main(String[] args) {

        /*
        * addFirts()
        * addLast()
        * removeFirst()
        * removeLast()
        * getFirst()
        * getLast()
        * */

        LinkedList<String> list=new LinkedList<>();
        list.add("Volvo");
        list.add("BMW");
        list.add("Jetta");

        //listando o array
        System.out.println(list);

        //Incluindo elemento no início

        list.addFirst("Mazda");

        //listando o array
        System.out.println(list);

        //incluindo elemento no fim
        list.addLast("Bugatti");

        //listando o array
        System.out.println(list);

        //listar o elemento da terceira posição
        String carro;
        carro = list.get(3);
        //listando o array
        System.out.println(carro);

        //removendo elemento da primeira posição
        list.removeFirst();

        //listando o array
        System.out.println(list);

        //removendo elemento da ultima posição
        list.removeLast();

        //listando o array
        System.out.println(list);

        //pega o primeiro elemento
        System.out.println(list.getFirst());

        //pega o ultimo elemento
        System.out.println(list.getLast());

        //listando o array
        System.out.println(list);

        //limpar o array
        list.clear();
        if(list.isEmpty()){
            System.out.println("LinkedList Vazio");
        }


    }

}
