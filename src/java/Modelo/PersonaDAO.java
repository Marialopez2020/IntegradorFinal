package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;

    //Listar/READ
    public List listar() {
        List<Persona> lista = new ArrayList<>();
        String sql = "SELECT * FROM persona";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona persona = new Persona();

                persona.setId(rs.getInt(1));
                persona.setNombre(rs.getString(2));
                persona.setApellido(rs.getString(3));
                persona.setTematica(rs.getString(4));

                lista.add(persona);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }
    
    //AGREGAR/CREAR/CREATE ----->PARA EL METODO AGREGAR/CREAR SE ESCRIBEN 2 CASES EN EL CONTROLADOR !!!
    //Para este metodo agregar, en el controlador crea 2 CASE: case "Nuevo" y case "Guardar"
    public int agregar(Persona persona) {
//        Declaramos una variable r para el resultado
        int r = 0;
        String sql = "INSERT INTO persona(nombre, apellido, tematica) VALUES(?,?,?)";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
    
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getTematica());
//            Para que nos avise si la variable persona se agrego a la base de datos hacemos que la variable r sea igual a lo que sigue
//                    y agregamos un if...
            r = ps.executeUpdate();
            if (r == 1) {
                r = 1;
            } else {
                r = 0;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return r;
    }

    
    //ACTUALIZAR/UPDATE
    //PARA EL METODO ACTUALIZAR/MODIFICAR PERSONA ASOCIADO AL BOTON DEL EDIT ---> CREAMOS 2 METODOS: listarId() y actualizar()
    public Persona listarID(int id) {
        String sql = "SELECT * FROM persona WHERE id=" + id;
        Persona persona = new Persona();
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                persona.setId(rs.getInt(1));
                persona.setNombre(rs.getString(2));
                persona.setApellido(rs.getString(3));
                persona.setTematica(rs.getString(4));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return persona;
    }
    
    public int actualizar(Persona persona){
        String sql = "UPDATE persona SET nombre=?, apellido=?, tematica=? WHERE id=?";
        int r = 0;
        
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getTematica());
            ps.setInt(4, persona.getId());
            
            r = ps.executeUpdate();
            
            if (r == 1) {
                r = 1;
            } else {
                r = 0;
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return r; 
    }
    
    //PARA ELIMINAR/DELETE
    //Este metodo lo vamos a llamar desde el controller cada vez que en index.jsp se seleccione el boton Delete
    public void delete(int id) {
        String sql ="DELETE FROM persona WHERE id=" + id;
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.executeQuery();
                      
        } catch (SQLException e) {
            System.out.println(e.toString());
        }      
    }
    
    public boolean eliminar(int _id) {

        String sql = "DELETE FROM persona WHERE id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, _id);
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }

    }
    
    
    
}
