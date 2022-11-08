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
        public static String basedatos="ciclodaw";

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

    public static boolean compruebaUsuario(String usuario, String pass) {
        boolean correcto=false;
        Connection cnn=null;
        
           try {
               String sql="SELECT * FROM profesores WHERE profre LIKE ? AND pass LIKE ?";
               cnn=CrearConexion();
               PreparedStatement pst=cnn.prepareStatement(sql);
               pst.setString(1, usuario);
               pst.setString(2, pass);
               ResultSet rs=pst.executeQuery();
               while(rs.next()){
                    correcto=true;
               }
           } catch (SQLException ex) {
               Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
           }
        return correcto;
    }
     public static ArrayList<alumno> listaAlumnos() {
        boolean correcto=false;
        Connection cnn=null;
        alumno alumno=null;
        ArrayList<alumno> alum=new ArrayList<>();
           try {
               String sql="SELECT * FROM alumnos";
               cnn=CrearConexion();
               PreparedStatement pst=cnn.prepareStatement(sql);
               ResultSet rs=pst.executeQuery();
               while(rs.next()){
                   String nombre=rs.getString("Nombre");
               String apellidos=rs.getString("Apellidos");
               String dawes=rs.getString("DAWES");
               String dawec=rs.getString("DAWEC");
               String diw=rs.getString("DIW");
               String daw=rs.getString("DAW");
               String fct=rs.getString("FCT");
               String proyecto=rs.getString("Proyecto");
               alumno=new alumno(nombre,apellidos,dawes,dawec,diw,daw,fct,proyecto);
               alum.add(alumno);
               }
               
           } catch (SQLException ex) {
               Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
           }
        return alum;
    }
}