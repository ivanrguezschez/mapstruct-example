package com.irs.mapstructexample.model.command;

public class UsuarioEditCommand {

    private Integer id;
    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer rol;
    private String fechaAlta;

    public UsuarioEditCommand() {
        super();
        this.id = null;
        this.nif = null;
        this.nombre = null;
        this.apellido1 = null;
        this.apellido2 = null;
        this.rol = null;
        this.fechaAlta = null;
    }

    public Integer getId() {
        return id;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public Integer getRol() {
        return rol;
    }
      
    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }
     
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();

        sb.append("UsuarioEditCommand{id=");
        sb.append(id);
        sb.append(", nif=");
        sb.append(nif);
        sb.append(", nombre=");
        sb.append(nombre);
        sb.append(", apellido1=");
        sb.append(apellido1);
        sb.append(", apellido2=");
        sb.append(apellido2);
        sb.append(", rol=");
        sb.append(rol);
        sb.append(", fechaAlta=");
        sb.append(fechaAlta);
        sb.append("}");

        return sb.toString();
    }
}
