package edu.umg.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Variables {

    private static final String DRIVER_db="com.mysql.jdbc.Driver"; //Metodo del driver
    private static final String URL_db="jdbc:mysql://localhost:3306/noticias"; //URL de la base de datos
    private static final String USER_db="root"; // Nombre del usuario
    private static final String PASSWORD_db="Elmismo11!"; // Contraseña de la base de datos

    public static Connection conn;

    static {  //asignación del valor para la variable

        try {
            Class.forName(DRIVER_db); //Se carga la clase
            conn = DriverManager.getConnection(URL_db, USER_db, PASSWORD_db); //asignacion del objeto
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

