package generics.controle;

import java.util.ArrayList;
import java.util.List;

public class Aeronaves {

    //lista com tipo especifico Integer
    private List<Integer> listaeronaves = new ArrayList<>();

    public void addVoo(Integer nrVoo){
        this.listaeronaves.add(nrVoo);
    }

    public Integer primeiroVoo(){
        if(listaeronaves.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }
        return listaeronaves.get(0);
    }

    public void listaVoos(){
        System.out.println("[");
        if (!listaeronaves.isEmpty()) {
            System.out.println(listaeronaves.get(0));
        }
        for (int i = 0; i <listaeronaves.size() ; i++) {
            System.out.println(" " + listaeronaves.get(i));
        }

        System.out.println("]");
    }


}
