package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BD {
       public static String usuario="root";
        public static String password="";
        public static String servidor="localhost:3306";
        public static String basedatos="vidioteca";

public static Connection CrearConexion(){
    Connection cnn=null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://"+servidor+"/"+basedatos;
        cnn= DriverManager.getConnection(url,usuario,password);
    } catch (ClassNotFoundException e) {
        System.out.println("Controladr JDBC no encontrado "+e.toString());
    } catch (Exception e){
        System.out.println("Otra excepcion "+e.toString());
    }
    return cnn;
}

    public static boolean filtraPeli(String titulo) {
        boolean correcto=false;
        
        Connection cnn=null;
        
       
           try {
                cnn=CrearConexion();
                String sql="SELECT * FROM";
                PreparedStatement pst=cnn.prepareStatement(sql);
           } catch (SQLException ex) {
               Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        return correcto;
    }

    public boolean compruebaUsuario(String usuario, String password) {
        boolean correcto=false;
        
        Connection cnn=null;
        
           try {
               cnn=CrearConexion();
               String sql="SELECT usuario, password FROM usuario WHERE usuario like ? AND password like ?"; 
               PreparedStatement pst = cnn.prepareStatement(sql);
               pst.setString(1, usuario);
               pst.setString(2, password);
               ResultSet rs=pst.executeQuery();
               while(rs.next()){
                   correcto=true;
               }
           } catch (SQLException ex) {
               Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
           }        
        
        return correcto;
        
    }
    public static ArrayList<Pelicula> listaPelis() {
        
        ArrayList<Pelicula> pelis=new ArrayList<>();
        Connection cnn=null;
        Pelicula peli=null;
           try {
               cnn=CrearConexion();
               String sql="SELECT * FROM peliculas"; 
               PreparedStatement pst = cnn.prepareStatement(sql);
               ResultSet rs=pst.executeQuery();
   
               while(rs.next()){
                   String titulo=rs.getString("titulo");
                   String director=rs.getString("director");
                   String fecha=rs.getString("fecha_estreno");
                   peli=new Pelicula(titulo,director,fecha);
                   pelis.add(peli);
               }
           } catch (SQLException ex) {
               Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
           }        
        
        return pelis;
    }
    public static ArrayList<Directores> listaDirectores() {
        
        ArrayList<Directores> directores=new ArrayList<>();
        Connection cnn=null;
        Directores director=null;
           try {
               cnn=CrearConexion();
               String sql="SELECT * FROM director"; 
               PreparedStatement pst = cnn.prepareStatement(sql);
               ResultSet rs=pst.executeQuery();
   
               while(rs.next()){
                   String id=rs.getString("id");
                   String nombre=rs.getString("nombre");
                   director=new Directores(id,nombre);
                   directores.add(director);
               }
           } catch (SQLException ex) {
               Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
           }        
        
        return directores;
    }
}
