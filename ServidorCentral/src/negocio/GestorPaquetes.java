/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.SQLException;

/**
 *
 * @author Cuatro
 */
public class GestorPaquetes {
     private ConectorJdbc conector;

    public GestorPaquetes(ConectorJdbc conector) {
        this.conector = conector;
    }
    public GestorPaquetes() {

        this.conector = new ConectorJdbc();
        
    }
    // TODO CREAR TABLA EN LA BASE DE DATOS
    public void agregarPaquetePersonalizado(String id, String region, String ciudad, String vuelos, String horaSalida, String horallegada, String valorVuelos, String valorHoteles) throws ClassNotFoundException, SQLException{
        conector.conectarse();
                conector.actualizar("INSERT INTO PAQUETEPERSONALIZADO"
                + " ("
                + "'" + id + "',"
                + "'" + region + "',"
                + "'" + ciudad + "',"
                + "'" + vuelos + "',"        
                + "'" + horaSalida + "',"
                + "'" + horallegada + "',"
                + "'" + valorVuelos + "',"
                + "'" + valorHoteles + "',"
                + ")");
        conector.desconectarse();
    }
    //TODO CREAR TABLA EN LA BASE DE DATOS
    public void agregarPaqueteTodoIncluido(String id, String nombre, String fechaLLegada, String fechaSalida, String descripcion, String costo) throws ClassNotFoundException, SQLException{
                conector.conectarse();
                conector.actualizar("INSERT INTO PAQUETESTODOINCLUIDO"
                + " ("
                + "'" + id + "',"
                + "'" + nombre + "',"
                + "'" + fechaLLegada + "',"
                + "'" + fechaSalida + "',"        
                + "'" + descripcion + "',"
                + "'" + costo + "',"
                + ")");
        conector.desconectarse();
    }
}
