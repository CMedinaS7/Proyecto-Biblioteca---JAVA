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
public class Libro {
    
    
    private String codigo;
    private String tit;
    private String aut;
    private String edi;
    private String npag;
    private String fing;
    private String tema;
    private boolean dis;
    
    //Declara Coleccion
    ArrayList<Libro> lstLib= null;
    
    //Constructor vacio
    public Libro() {
        lstLib= new ArrayList<Libro>(); //Creacion de la Coleccion
    }

    public Libro(String codigo, String tit, String aut, String edi, String npag, String fing, String tema,boolean dis) {

        this.codigo = codigo;
        this.tit = tit;
        this.aut = aut;
        this.edi = edi;
        this.npag = npag;
        this.fing = fing;
        this.tema = tema;
        this.dis = dis;
        
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tit
     */
    public String getTit() {
        return tit;
    }

    /**
     * @param tit the tit to set
     */
    public void setTit(String tit) {
        this.tit = tit;
    }

    /**
     * @return the aut
     */
    public String getAut() {
        return aut;
    }

    /**
     * @param aut the aut to set
     */
    public void setAut(String aut) {
        this.aut = aut;
    }

    /**
     * @return the edi
     */
    public String getEdi() {
        return edi;
    }

    /**
     * @param edi the edi to set
     */
    public void setEdi(String edi) {
        this.edi = edi;
    }

    /**
     * @return the npag
     */
    public String getNpag() {
        return npag;
    }

    /**
     * @param npag the npag to set
     */
    public void setNpag(String npag) {
        this.npag = npag;
    }

    /**
     * @return the fing
     */
    public String getFing() {
        return fing;
    }

    /**
     * @param fing the fing to set
     */
    public void setFing(String fing) {
        this.fing = fing;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the dis
     */
    public boolean isDis() {
        return dis;
    }

    /**
     * @param dis the dis to set
     */
    public void setDis(boolean dis) {
        this.dis = dis;
    }

          //---Metodos Adicionales---

    //Agrega Objs Empleado a la coleccion
    public boolean agregarLibro(Libro l)
    {
        if(l!=null)
        {
            lstLib.add(l);
            return true;
        }else
            return false;
    }

    //Busca el Objs Empleado por su Codigo
    public Libro buscarLibCod(String codigo)
    {
        Libro lib=null;
        for(Libro l: lstLib) //Recorre la coleccion
        {
            if(codigo.equals(l.getCodigo())) //Verifica si existe el Nombre en la coleccion
            {
                lib = l;      //Captura el Obj Empleado encontrado
                break;        //Termina el for porque ya encontro el Obj
            }
        }
        return lib; //Retorna el Obj encontrado
    }

        public Libro buscarLibNom(String nombre)
    {
        Libro lib=null;
        for(Libro l: lstLib) //Recorre la coleccion
        {
            if(nombre.equals(l.getTit() + " - " + l.getAut())) //Verifica si existe el Nombre en la coleccion
            {
                lib = l;      //Captura el Obj Empleado encontrado
                break;        //Termina el for porque ya encontro el Obj
            }
        }
        return lib; //Retorna el Obj encontrado
    }
        
    //Modifica el Obj. Empleado mediante su indice y su codigo
    public boolean modificarLib(int indice, Libro li)
    {
        if(li!=null) {
            lstLib.set(indice, li);//Modifica en la Coleccion
            return true;
        }
        else
            return false;
    }

    //Elimina el obj de la Coleccion mediante su indice (Nota: Tambien se puede eliminar mediante el Obj. Empleado)
    public Libro eliminarLibro(int indice) {
        return lstLib.remove(indice);//Elimina x indice
    }
    //Obtiene el obj. Empleado mediante su indice
    public Libro obtenerLibro(int indice) {
        return lstLib.get(indice); //Obtiene
    }
    //Obtiene el indice de la coleccion mediante el obj. Empleado
    public int obtenerIndice(Libro li) {
        return lstLib.indexOf(li); //Busca indice x obj
    }
    //Obitne la cantidad de Objs. creados en la coleccion
    public int obtenerCantidad() {
        return lstLib.size();
    }
    
}
