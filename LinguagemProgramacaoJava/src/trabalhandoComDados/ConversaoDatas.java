package trabalhandoComDados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConversaoDatas {
    public static void main(String[] args) throws ParseException {

        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        System.out.println(data);
        //formatando como eu quero mostrar a data
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yy  HH:mm:ss");
        System.out.println("Data Formatada: "+simpleDateFormat.format(data));
        System.out.println("Data Formatada: "+simpleDateFormat2.format(data));

        //Converte Objetos
        System.out.println("Data convertida: "+simpleDateFormat.parse("02/08/1970"));

        //posso converter em formato Date também

    }
}
