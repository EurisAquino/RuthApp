package Conexiones;
/**
 *
 * @author euris
 */
public class Clientes {
    
    private String NombreCliente;
    private String Deuda;
    private String Abono;
    private int Resultante;
    private int Id;

    public Clientes(String NombreCliente, String Deuda, String Abono, int Resultante) {
        this.NombreCliente = NombreCliente;
        this.Deuda = Deuda;
        this.Abono = Abono;
        this.Resultante = Resultante;
    }
    
    //ID

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Clientes(int Id) {
        this.Id = Id;
    }
    
    //Nombre
    
    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }
    
    //Deuda

    public String getDeuda() {
        return Deuda;
    }

    public void setDeuda(String Deuda) {
        this.Deuda = Deuda;
    }
    
    //Abono

    public String getAbono() {
        return Abono;
    }

    public void setAbono(String Abono) {
        this.Abono = Abono;
    }
    
    //Resultante

    public int getResultante() {
        return Resultante;
    }

    public void setResultante(int Resultante) {
        this.Resultante = Resultante;
    }
    
}
