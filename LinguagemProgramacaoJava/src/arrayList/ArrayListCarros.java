package arrayList;

import javax.swing.*;
import java.util.ArrayList;

public class ArrayListCarros {
    public static void main(String[] args) {
        //construindo um arraylist para os carros
        //instanciando o objeto
        ArrayList<String> carros = new ArrayList<>();


        //adicionando carros ao arraylist
        carros.add("Fusca");
        carros.add("Fluence");
        carros.add("Kombi");
        carros.add("Fiorino");
        carros.add("Porshe");
        carros.add("BMW");
        carros.add("Bugatti");
        carros.add("Corsa");

        //mostrar array
        System.out.println(carros);

        //substituit Mercedes por Van
        carros.set(4,"Vectra");

        //remover vectra
        carros.remove("Vectra");

        //mostrar array atualizado
        System.out.println(carros);

        //quantidade de elementos dentro da lista
        System.out.println("A quantidade total de elementos: "+ carros.size());

        //Adicionando carros ao arrayList com JOptionaPane
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro: "));

        //mostrar array atualizado
        System.out.println(carros);

        //quantidade de elementos dentro da lista
        System.out.println("A quantidade total de elementos: "+ carros.size());

        /*
        //esvaziando o array
        carros.clear();

        //mostrar array atualizado
        System.out.println(carros);

        //verificar se o array está vazio
        if(carros.isEmpty()){
            System.out.println("O vetor está vazio");
        }*/

        boolean achei=false;
        if(carros.contains("BMW")){
            //SUBSTITUINDO QUANDO NÃO SE SABE A POSIÇÃO
            for (int i = 0; i <carros.size() ; i++) {
                if("BMW".equalsIgnoreCase((carros.get(i)))){
                    //se ele encontrar ele altera BMW por Bugatti
                    carros.set(i, "Bugatti");
                    achei=true;
                    break;
                }
            }
        }else{
            System.out.println("Não encontrei o argumento pesquisado!");
        }
        if(!achei){
            System.out.println("Não encontrei o argumento pesquisado!");
        }else {
            System.out.println("Achei o argumento pesquisado na posição"+ carros.indexOf("BMW"));
        }

        //mostrar array atualizado
        System.out.println(carros);

        //quantidade de elementos dentro da lista
        System.out.println("A quantidade total de elementos: "+ carros.size());

    }
}
