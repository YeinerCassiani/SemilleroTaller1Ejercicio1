
package ejercicio1;

/**
 *
 * @author ycassiani
 */
public class Factura extends Precio{
    private String empresaEmisora;
    private String cliente;
    
    public Factura(double precio, String empresaEmisora, String cliente) {
        super(precio);
        this.empresaEmisora = empresaEmisora;
        this.cliente = cliente;
    }
    
    public void imprimirFactura() {
        System.out.println("Empresa Emisora: " + empresaEmisora);
        System.out.println("Cliente: " + cliente);
        System.out.println("Precio: $" + obtenerPrecio());
    }
}
