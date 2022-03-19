package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author euris
 */
public class Conexion {
    
    private final String url = "jdbc:mysql://localhost/tiendaRuth";
    private final String username = "root";
    private final String password = "";
    
    private Connection con;
    private Statement stmnt;
    private ResultSet rs;
    private PreparedStatement ps;
    
    public void conectar() {
        
        try {
            con = DriverManager.getConnection(url, username, password);
            stmnt = con.createStatement();
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public void desconectar() {
        try {

            if (con != null) {
                con.close();
            }

            System.out.println("Desconectado");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void tryCon(String sql){
        
        try{
            stmnt.executeUpdate(sql);
            
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        
    }
    
    public static Connection getConexion() {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tiendaruth","root","");
            
            return con;          
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public void insertarProductos(Productos pro) {
        conectar();

        String sql = "INSERT INTO productos(nombre, cantidad, precio) "
                + "VALUES('" + pro.getNombre() + "', "
                + "'" + pro.getCantidad() + "', "
                + pro.getPrecio() + ")";

        tryCon(sql);
        JOptionPane.showMessageDialog(null, "Producto Agregado");
        
        desconectar();

    }
    
    public void insertarClientes(Clientes cli) {
        conectar();

        String sql = "INSERT INTO clientes(nombre, deuda, abono, pendiente) "
                + "VALUES('" + cli.getNombreCliente()+ "', "
                + "'" + cli.getDeuda() + "', "
                + "'" + cli.getAbono() + "', "
                + cli.getResultante() + ")";

        tryCon(sql);
        JOptionPane.showMessageDialog(null, "Cliente Agregado");
        
        desconectar();

    }
    
    public void borrarProducto(Productos pro){
        conectar();
        
        String sql = "DELETE FROM productos WHERE id = "
                + pro.getId();
        
        tryCon(sql);
        JOptionPane.showMessageDialog(null, "Producto Eliminado");
        
        desconectar();
    }
    
    public void borrarClientes(Clientes cli){
        conectar();
        
        String sql = "DELETE FROM clientes WHERE id = "
                + cli.getId();
        
        tryCon(sql);
        JOptionPane.showMessageDialog(null, "Cliente Eliminado");
        
        desconectar();
    }
    
    public void actualizarProducto(Productos pro){
    conectar();
        String sql ="UPDATE productos SET nombre= '"+ pro.getNombre()+"', cantidad = '"+ pro.getCantidad() +"', precio = '"+ pro.getPrecio() +"' where id = '"+ pro.getId()+"'";        
        try {
            stmnt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Producto Modificado");
        } catch (SQLException ex) {
        }

        desconectar();

    }
    
    public void actualizarClientes(Productos pro){
    conectar();
        String sql ="UPDATE clientes SET nombre= '"+ pro.getNombreCliente()+"', deuda = '"+ pro.getDeuda() +"', abono = '"+ pro.getAbono() +"', pendiente = '" + pro.getPendiente() +"' where id = '"+ pro.getIdCliente()+"'";
                
        try {
            stmnt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cliente Modificado");
        } catch (SQLException ex) {
        }

        desconectar();

    }
    
    public void buscarProducto(Productos pro){
        conectar();

        String sql = "SELECT id,nombre,cantidad,precio FROM productos WHERE nombre = "
                + pro.getNombre();
                
        try {
            ResultSet executeQuery = stmnt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        desconectar();
    }
    
    public void buscarCliente(Productos pro){
        conectar();

        String sql = "SELECT id,nombre,deuda,abono,pendiente FROM clientes WHERE id = "
                + pro.getIdCliente();
                
        try {
            ResultSet executeQuery = stmnt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        desconectar();
    }
    
}
