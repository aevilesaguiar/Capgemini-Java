package classesWrapper;

public class Demostracao {
    public static void main(String[] args) {

        //Um tipo primitivo não tem como transformar em objeto sem utilizar a classe Wrapper
        //Autoboxing -> conversão de primitivo para wrapper. Ex: int -> Integer

        //Exemplos de autoboxing
        Boolean bolWrapper=true;
        System.out.println(bolWrapper.getClass());

        Character chWrapper='a';
        System.out.println(chWrapper.getClass());

        Byte byteWrapper=1;
        System.out.println(byteWrapper.getClass());

        Short shoWrapper='B';
        System.out.println(shoWrapper.getClass());

        Integer intWrapper=5212;
        System.out.println(intWrapper.getClass());

        Long lonWrapper=148565656566666L;
        System.out.println(lonWrapper.getClass());

        Float floWrapper=148565.656566666f;
        System.out.println(floWrapper.getClass());

        Double doWrapper=148565.6565665;
        System.out.println(doWrapper.getClass());

        //Integer é uma classe wrapper o qual estamos convertendo uma string para inteiro
        int numero =Integer.parseInt("1");
        numero+=numero;
        System.out.println(numero);





    }
}
