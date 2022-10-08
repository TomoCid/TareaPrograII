public class Main {
    public static void main(String[] args) {
        //TESTEANDO CLASES
    Cliente cliente1 = new Cliente("Juan", "2121");
    System.out.println(cliente1.toString());

    Articulo MesaDeMadera = new Articulo(20,"Comedor elegante","Mueble de roble", 500);
        System.out.println(MesaDeMadera.toString());


        DetalleCompra CantidadMesa = new DetalleCompra(MesaDeMadera, 2);
        System.out.println( CantidadMesa.CalcPrecio() );

    }
}
