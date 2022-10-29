package edu.umg.dao;

import edu.umg.model.Noticias;
import edu.umg.utils.Variables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NoticiasDAO {

    public List<Noticias> getAllDB(){

        List<Noticias> noticias = new ArrayList<>(); // Creación de ArrayList

        try {
            Statement statement = Variables.conn.createStatement();
            String consulta = "select*from noticias"; //Consulta sobre todos los datos existentes

            ResultSet rs = statement.executeQuery(consulta);
            while (rs.next()){

                noticias.add(new Noticias(rs.getString("correlativo"),rs.getString("title"),
                        rs.getString("abstracto"),rs.getString("byline"),
                        rs.getString("url"))); //se guardan los datos


            }


        } catch (SQLException e) { //Generación de excepción en caso de error
            throw new RuntimeException(e);
        }


        return noticias; //Devuelve datos sobre las consultas realizadas
    }
}
