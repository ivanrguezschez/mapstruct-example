package com.irs.mapstructexample.model.entity;

import java.util.Date;

public class Usuario {

    private Integer idUsuario;
    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Rol rol;
    private Date fechaAlta;

    public Usuario() {
        super();
        this.idUsuario = null;
        this.nif = null;
        this.nombre = null;
        this.apellido1 = null;
        this.apellido2 = null;
        this.rol = null;
        this.fechaAlta = null;
    }

    public Integer getIdUsuario() {
        return idUsuario;
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

    public Rol getRol() {
        return rol;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Usuario{idUsuario=");
        sb.append(idUsuario);
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
