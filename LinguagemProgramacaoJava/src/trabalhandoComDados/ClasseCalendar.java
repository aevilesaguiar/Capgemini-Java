package trabalhandoComDados;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Calendar;

public class ClasseCalendar {
    public static void main(String[] args) {

        //Recuperação da data com a classe Calendar

        System.out.println("==> Recuperação da data com a classe Calendar");
        //podemos pega uma diversidade de informações
        Calendar calendar= Calendar.getInstance();

/*
        System.out.println("Data e hora atual: "+calendar.getTime() + "\n");

        System.out.println("Ano: "+calendar.get(Calendar.YEAR));
        System.out.println("Dia do mês: "+calendar.get(Calendar.DAY_OF_MONTH)+ "\n");

        System.out.println("==> alterando data e hora com método set");
        calendar.set(Calendar.YEAR,2023);
        calendar.set(Calendar.DAY_OF_MONTH,12);
        System.out.println("Data/Hora atual: "+calendar.getTime());
        System.out.println("Ano: "+calendar.get(Calendar.YEAR));
        System.out.println("Dia do Mês: "+calendar.get(Calendar.DAY_OF_MONTH)+"\n");
*/
        //Recuperando a hora do dia

        System.out.println("==> Recuperando a hora do dia");
        Calendar calendar1=Calendar.getInstance();
        //capturo a hora com Calendar.hour_of_day
        int hora = calendar1.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar1.get(Calendar.MINUTE);
        int segundos = calendar1.get(Calendar.SECOND);
        System.out.println("Agora são: "+hora+ " hrs" + minutes +" minutos" + segundos + " segundos");

        if(hora>6 && hora<12){
            System.out.println("Bom dia!");
        }else if(hora>12 && hora<18){
            System.out.println("Boa tarde");
        }else{
            System.out.println("Boa noite!");
        }

    }
}
