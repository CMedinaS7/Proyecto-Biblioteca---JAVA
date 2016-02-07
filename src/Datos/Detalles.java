/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author Carlos J Medina
 */
public class Detalles {
 
    private String fecha;
    private String libro;
    private String lector;
    private String personal;
    private String descripcion;
    
    
    //Declara Coleccion
    ArrayList<Detalles> lstDet= null;
    
    //Constructor vacio
    public Detalles() {
        lstDet= new ArrayList<Detalles>(); //Creacion de la Coleccion
    }

    public Detalles(String fecha, String libro, String lector,String personal, String descripcion) {

        this.fecha = fecha;
        this.libro = libro;
        this.lector = lector;
        this.personal = personal;
        this.descripcion = descripcion;
        
    }

   

       //---Metodos Adicionales---

    //Agrega Objs Empleado a la coleccion
    public boolean agregarDetalle(Detalles l)
    {
        if(l!=null)
        {
            lstDet.add(l);
            return true;
        }else
            return false;
    }

    //Busca el Objs Empleado por su Codigo
    public Detalles buscarDetLib(String lib)
    {
        Detalles lec=null;
        for(Detalles d: lstDet) //Recorre la coleccion
        {
            if(lib.equals(d.getLibro())) //Verifica si existe el Nombre en la coleccion
            {
                lec = d;      //Captura el Obj Empleado encontrado
                break;        //Termina el for porque ya encontro el Obj
            }
        }
        return lec; //Retorna el Obj encontrado
    }
    
   
   
    //Obitne la cantidad de Objs. creados en la coleccion
    public int obtenerCantidad() {
        return lstDet.size();
    }
    @Override
    public String toString() {
        return "Detalles{" + "Libro=" + libro + '}';
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the libro
     */
    public String getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(String libro) {
        this.libro = libro;
    }

    /**
     * @return the lector
     */
    public String getLector() {
        return lector;
    }

    /**
     * @param lector the lector to set
     */
    public void setLector(String lector) {
        this.lector = lector;
    }

    /**
     * @return the personal
     */
    public String getPersonal() {
        return personal;
    }

    /**
     * @param personal the personal to set
     */
    public void setPersonal(String personal) {
        this.personal = personal;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
