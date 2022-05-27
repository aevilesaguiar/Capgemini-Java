package anottations;


 class DeprecatedTeste {

    void visualizar(){
        System.out.println("Método de visualização");
    }

    /*
    * @deprecated replaced by display()
    *
    * */
    @Deprecated
    void exibir(){
        System.out.println("Mostrando que o método exbir é deprecated");
    }


}
