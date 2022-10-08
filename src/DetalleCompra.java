public class DetalleCompra {

    private int cantidad;
    private Articulo b;

    public float CalcPrecio(){
        return b.getPrecio() * cantidad;
    }

    public void calcPrecioSinIVA(){

    }

    public void calcPeso(){

    }

    public DetalleCompra(Articulo a, int cantidad) {

        this.b = a;
        this.cantidad = cantidad;

    }


}
