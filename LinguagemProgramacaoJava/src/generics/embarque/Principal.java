package generics.embarque;


import generics.controle.Aeronaves;

import java.util.Scanner;

/**
 * Informar a quantidade de aeronaves no pátio, o numero dos vôos por ordem de chaegada.
 * A ordem de decolagem é FIFO, o primeiro que entra é o primeiro que sai
 * Mostrar qual o primeiro vôo a decolar
 */
public class Principal {
    public static void main(String[] args) {

        //setup
        Scanner scanner = new Scanner(System.in);

        //instanciando um objeto
        Aeronaves aeronaves=new Aeronaves();

        //input
        System.out.println("Informe o numero de aeronaves");
        int nrAeronaves=scanner.nextInt();

        //adicionando voos

        for (int i = 0; i <nrAeronaves ; i++) {
            System.out.println("Adicionando voos");
            int nrVoo= scanner.nextInt();
            aeronaves.addVoo(nrVoo);

        }

        System.out.println("O primeiro a decolar vai ser o nr " + aeronaves.primeiroVoo());
        aeronaves.listaVoos();

        scanner.close();

    }
}
