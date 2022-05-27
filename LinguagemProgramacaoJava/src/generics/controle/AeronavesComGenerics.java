package generics.controle;

import java.util.ArrayList;
import java.util.List;


public class AeronavesComGenerics <T>{

    private List<T> list = new ArrayList();

    public void addVoo(T nrVoo){
        list.add(nrVoo);
    }

    public T primeiroVoo() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }
    public void listaVoos() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.print("]");
    }


}
