import java.util.Date;

public class Pago {

    /* Cada tipo de pago tendra sus propios metodos para hacer saber al cliente
    cuanto le corresponde de vuelto o cuanta deuda tiene.  */
    private float  Monto;
    private Date fecha;

    public Pago(float dinero){
        this.Monto = dinero;
    }

    public Pago() {
    }

}
