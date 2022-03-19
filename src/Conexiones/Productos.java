package Conexiones;
/**
 *
 * @author euris
 */
public class Productos {
    
    public Productos(String Nombre, String cantidad, String Precio) {
        this.Nombre = Nombre;
        this.Cantidad = cantidad;
        this.Precio = Precio;
    }

    public Productos(int Id, String Nombre, String Cantidad, String Precio) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }
    
    // Abono
    private String Abono;

    public String getAbono() {
        return Abono;
    }

    public void setAbono(String Abono) {
        this.Abono = Abono;
    }
    
    // Deuda
    private String Deuda;

    public String getDeuda() {
        return Deuda;
    }

    public void setDeuda(String deuda) {
        this.Deuda = deuda;
    }
    
    // Pendiente
    
    private int Pendiente;

    public int getPendiente() {
        return Pendiente;
    }

    public void setPendiente(int Pendiente) {
        this.Pendiente = Pendiente;
    }
    
    // ID
    
    private int Id;
    
    public Productos(int Id) {
        this.Id = Id;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    //Nombre
    
    private String Nombre;

    public Productos(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    // Cantidad
    
    private String Cantidad;
    
    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        this.Cantidad = cantidad;
    }
    
    //Precio
    
    private String Precio;
    
    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        this.Precio = precio;
    }

    public Productos(String Abono, String Deuda, int Pendiente, String NombreCliente) {
        this.Abono = Abono;
        this.Deuda = Deuda;
        this.Pendiente = Pendiente;
        this.NombreCliente = NombreCliente;
    }

    public Productos(String Abono, String Deuda, int Pendiente, int IdCliente, String NombreCliente) {
        this.Abono = Abono;
        this.Deuda = Deuda;
        this.Pendiente = Pendiente;
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
    }
    
    //Id Clientes 
    private int IdCliente;

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }
        
    //Nombre Cliente
    private String NombreCliente;

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }
    
    
    
}
