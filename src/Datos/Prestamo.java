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
public class Prestamo {

    private String ficha;
    private String fecha;
    private String lector;
    private String libro;
    private String personal;
    private String estado;
    
    
     //Declara Coleccion
    ArrayList<Prestamo> lstPre= null;
    
    //Constructor vacio
    public Prestamo() {
        lstPre= new ArrayList<Prestamo>(); //Creacion de la Coleccion
    }

    public Prestamo(String ficha, String fecha, String lector, String libro, String personal,String estado) {

        this.ficha = ficha;
        this.fecha = fecha;
        this.lector = lector;
        this.libro = libro;
        this.personal = personal;
        this.estado=estado;
        
    }

    /**
     * @return the ficha
     */
    public String getFicha() {
        return ficha;
    }

    /**
     * @param ficha the ficha to set
     */
    public void setFicha(String ficha) {
        this.ficha = ficha;
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

       //---Metodos Adicionales---

    //Agrega Objs Empleado a la coleccion
    public boolean agregarPrestamo(Prestamo p)
    {
        if(p!=null)
        {
            lstPre.add(p);
            return true;
        }else
            return false;
    }

    //Obitne la cantidad de Objs. creados en la coleccion
    public int obtenerCantidad() {
        return lstPre.size();
    }
    
    public Prestamo buscarPreCod(String ficha)
    {
        Prestamo pre=null;
        for(Prestamo p: lstPre) //Recorre la coleccion
        {
            if(ficha.equals(p.getFicha())) //Verifica si existe el Nombre en la coleccion
            {
                pre = p;      //Captura el Obj Empleado encontrado
                break;        //Termina el for porque ya encontro el Obj
            }
        }
        return pre; //Retorna el Obj encontrado
    }
    
    public Prestamo buscarPreLec(String lec)
    {
        Prestamo pre=null;
        for(Prestamo p: lstPre) //Recorre la coleccion
        {
            if(lec.equals(p.getLector())) //Verifica si existe el Nombre en la coleccion
            {
                pre = p;      //Captura el Obj Empleado encontrado
                break;        //Termina el for porque ya encontro el Obj
            }
        }
        return pre; //Retorna el Obj encontrado
    }
    
        //Modifica el Obj. Empleado mediante su indice y su codigo
    public boolean modificarPre(int indice, Prestamo pr)
    {
        if(pr!=null) {
            lstPre.set(indice, pr);//Modifica en la Coleccion
            return true;
        }
        else
            return false;
    }
    
     public int obtenerIndice(Prestamo pr) {
        return lstPre.indexOf(pr); //Busca indice x obj
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
