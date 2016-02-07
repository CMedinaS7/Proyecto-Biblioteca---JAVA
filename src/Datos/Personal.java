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
public class Personal {
 
    private String codigo;
    private String nom;
    private String ape;
    private String dir;
    private String fing;
    private String dni;
    private String sexo;
    private String tel;
    private int activo;
    
    //Declara Coleccion
   ArrayList<Personal> lstPer= null;
    
    //Constructor vacio
    public Personal() {
        lstPer= new ArrayList<Personal>(); //Creacion de la Coleccion
    }

    public Personal(String codigo, String nom, String ape,String dir, String fing, String dni, String sexo, String tel,int activo) {

        this.codigo = codigo;
        this.nom = nom;
        this.ape = ape;
        this.dir = dir;
        this.fing = fing;
        this.dni = dni;
        this.sexo = sexo;
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
     * @return the dir
     */
    public String getDir() {
        return dir;
    }

    /**
     * @param ape the ape to set
     */
    public void setDir(String dir) {
        this.dir = dir;
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
    public String getSexo() {
        return sexo;
    }

    /**
     * @param id the id to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
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
       //---Metodos Adicionales---

    //Agrega Objs Personal a la coleccion
    public boolean agregarPersonal(Personal p)
    {
        if(p!=null)
        {
            lstPer.add(p);
            return true;
        }else
            return false;
    }

    //Busca el Objs Empleado por su Codigo
    public Personal buscarPerDNI(String dni)
    {
        Personal per=null;
        for(Personal p: lstPer) //Recorre la coleccion
        {
            if(dni.equals(p.getDni())) //Verifica si existe el Nombre en la coleccion
            {
                per = p;      //Captura el Obj Empleado encontrado
                break;        //Termina el for porque ya encontro el Obj
            }
        }
        return per; //Retorna el Obj encontrado
    }
    public Personal buscarPerCod(String codigo)
    {
        Personal per=null;
        for(Personal p: lstPer) //Recorre la coleccion
        {
            if(codigo.equals(p.getCodigo())) //Verifica si existe el Nombre en la coleccion
            {
                per = p;      //Captura el Obj Empleado encontrado
                break;        //Termina el for porque ya encontro el Obj
            }
        }
        return per; //Retorna el Obj encontrado
    }

    //Modifica el Obj. Empleado mediante su indice y su codigo
    public boolean modificarPer(int indice, Personal pe)
    {
        if(pe!=null) {
            lstPer.set(indice, pe);//Modifica en la Coleccion
            return true;
        }
        else
            return false;
    }

    //Elimina el obj de la Coleccion mediante su indice (Nota: Tambien se puede eliminar mediante el Obj. Empleado)
    public Personal eliminarPersonal(int indice) {
        return lstPer.remove(indice);//Elimina x indice
    }
    //Obtiene el obj. Empleado mediante su indice
    public Personal obtenerPersonal(int indice) {
        return lstPer.get(indice); //Obtiene
    }
    //Obtiene el indice de la coleccion mediante el obj. Empleado
    public int obtenerIndice(Personal pe) {
        return lstPer.indexOf(pe); //Busca indice x obj
    }
    //Obitne la cantidad de Objs. creados en la coleccion
    public int obtenerCantidad() {
        return lstPer.size();
    }
      
}
