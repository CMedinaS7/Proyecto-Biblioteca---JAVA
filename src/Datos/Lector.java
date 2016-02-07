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
public class Lector {
 
    private String codigo;
    private String nom;
    private String ape;
    private String fing;
    private String dir;
    private String dni;
    private String id;
    private String tel;
    private int activo;
    
    
    //Declara Coleccion
    ArrayList<Lector> lstLec= null;
    
    //Constructor vacio
    public Lector() {
        lstLec= new ArrayList<Lector>(); //Creacion de la Coleccion
    }

    public Lector(String codigo, String nom, String ape,String dir, String fing, String dni, String id, String tel,int activo) {

        this.codigo = codigo;
        this.nom = nom;
        this.ape = ape;
        this.dir = dir;
        this.fing = fing;
        this.dni = dni;
        this.id = id;
        this.tel = tel;
        this.activo=activo;
        
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
     * @return the dir
     */
    public String getDir() {
        return dir;
    }

    /**
     * @param dir the codigo to set
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the ape
     */
    public String getApe() {
        return ape;
    }

    /**
     * @param ape the ape to set
     */
    public void setApe(String ape) {
        this.ape = ape;
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
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

       //---Metodos Adicionales---

    //Agrega Objs Empleado a la coleccion
    public boolean agregarLector(Lector l)
    {
        if(l!=null)
        {
            lstLec.add(l);
            return true;
        }else
            return false;
    }

    //Busca el Objs Empleado por su Codigo
    public Lector buscarLecID(String id)
    {
        Lector lec=null;
        for(Lector l: lstLec) //Recorre la coleccion
        {
            if(id.equals(l.getId())) //Verifica si existe el Nombre en la coleccion
            {
                lec = l;      //Captura el Obj Empleado encontrado
                break;        //Termina el for porque ya encontro el Obj
            }
        }
        return lec; //Retorna el Obj encontrado
    }
    
        public Lector buscarLecCod(String codigo)
    {
        Lector lec=null;
        for(Lector l: lstLec) //Recorre la coleccion
        {
            if(codigo.equals(l.getCodigo())) //Verifica si existe el Nombre en la coleccion
            {
                lec = l;      //Captura el Obj Empleado encontrado
                break;        //Termina el for porque ya encontro el Obj
            }
        }
        return lec; //Retorna el Obj encontrado
    }
        
        public Lector buscarLecDNI(String dni)
    {
        Lector lec=null;
        for(Lector l: lstLec) //Recorre la coleccion
        {
            if(dni.equals(l.getDni())) //Verifica si existe el Nombre en la coleccion
            {
                lec = l;      //Captura el Obj Empleado encontrado
                break;        //Termina el for porque ya encontro el Obj
            }
        }
        return lec; //Retorna el Obj encontrado
    }
        

    //Modifica el Obj. Empleado mediante su indice y su codigo
    public boolean modificarLec(int indice, Lector le)
    {
        if(le!=null) {
            lstLec.set(indice, le);//Modifica en la Coleccion
            return true;
        }
        else
            return false;
    }

    //Elimina el obj de la Coleccion mediante su indice (Nota: Tambien se puede eliminar mediante el Obj. Empleado)
    public Lector eliminarLector(int indice) {
        return lstLec.remove(indice);//Elimina x indice
    }
    //Obtiene el obj. Empleado mediante su indice
    public Lector obtenerLector(int indice) {
        return lstLec.get(indice); //Obtiene
    }
    //Obtiene el indice de la coleccion mediante el obj. Empleado
    public int obtenerIndice(Lector le) {
        return lstLec.indexOf(le); //Busca indice x obj
    }
    //Obitne la cantidad de Objs. creados en la coleccion
    public int obtenerCantidad() {
        return lstLec.size();
    }
    @Override
    public String toString() {
        return "Lector{" + "ID=" + id + '}';
    }

    /**
     * @return the activo
     */
    public int getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(int activo) {
        this.activo = activo;
    }
    
}
