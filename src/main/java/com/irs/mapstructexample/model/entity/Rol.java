package com.irs.mapstructexample.model.entity;

public class Rol {

    private Integer idRol;
    private String nombre;

    public Rol() {
        super();
        this.idRol = null;
        this.nombre = null;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Rol{idRol=");
        sb.append(idRol);
        sb.append(", nombre=");
        sb.append(nombre);
        sb.append("}");

        return sb.toString();
    }
}
