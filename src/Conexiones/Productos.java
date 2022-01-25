package Conexiones;
/**
 *
 * @author euris
 */
public class Productos {
    
    public Productos(String Nombre, String cantidad, String Precio,String Nota) {
        this.Nombre = Nombre;
        this.Cantidad = cantidad;
        this.Precio = Precio;
        this.Nota = Nota;
        this.Id = Id;
    }

    public Productos(String Nombre, String Cantidad, String Precio) {
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }
    
    // ID
    
    private int Id;
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    
    //Nombre
    
    private String Nombre;

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
    
    //Fecha
    
    private String Nota;

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }
    
}
