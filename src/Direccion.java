public class Direccion {

    private String direccion;

    /*La idea de la direccion es asociarla a un cliente y luego dejarla en la boleta,
    por lo tanto tendremos un metodo get */
    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

}
