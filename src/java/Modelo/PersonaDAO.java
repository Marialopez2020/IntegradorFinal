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
    
    //AGREGAR/CREAR/CREATE
    public int agregar(Persona persona) {
        int r = 0;
        String sql = "INSERT INTO persona(nombre, apellido, tematica) VALUES(?,?,?)";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
    
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getTematica());

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
