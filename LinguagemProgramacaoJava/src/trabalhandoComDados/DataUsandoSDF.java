package trabalhandoComDados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;


public class DataUsandoSDF {
    public static void main(String[] args) throws ParseException {

        //usando SDF - Simmple Date Format

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yy");
        //MUDANDO A CARACTERÍSTICA PARA PEGAR O HORÁRIO DE GRENWICH
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date(29/12/2022);

        //traz a data em milisegundos
        Date x2= new Date(System.currentTimeMillis());

        Date x3=new Date(0L);
        Date x4= new Date(1000L * 60L *60L*5L);


        Date y1=(Date) sdf1.parse("29/05/2022");
        //é uma string qu estou convertendo
        Date y2=(Date) sdf2.parse("29/05/2022 16:32:55");
        //converte para data
        Date y3=(Date) Date.from(Instant.parse("2022-06-29T16:32:55Z"));


        System.out.println("x1: "+x1);
        System.out.println("x2: "+x2);
        System.out.println("x3: "+x3);
        System.out.println("x4: "+x4);
        System.out.println("y1: "+y1);
        System.out.println("y2: "+y2);
        System.out.println("y3: "+y3);
        System.out.println("----------------------------");
        System.out.println("x1: "+sdf2.format(x1));
        System.out.println("x2: "+sdf2.format(x2));
        System.out.println("x3: "+sdf2.format(x3));
        System.out.println("x4: "+sdf2.format(x4));
        System.out.println("y1: "+sdf2.format(y1));
        System.out.println("y2: "+sdf2.format(y2));
        System.out.println("y3: "+sdf2.format(y3));
        System.out.println("-----------------------------");
        System.out.println("x1: "+sdf3.format(x1));
        System.out.println("x2: "+sdf3.format(x2));
        System.out.println("x3: "+sdf3.format(x3));
        System.out.println("x4: "+sdf3.format(x4));
        System.out.println("y1: "+sdf3.format(y1));
        System.out.println("y2: "+sdf3.format(y2));
        System.out.println("y3: "+sdf3.format(y3));
        System.out.println("---------TESTE-----------");
        System.out.println("y4: "+sdf4.format(x1));

    }
}
