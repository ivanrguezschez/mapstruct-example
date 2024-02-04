package com.irs.mapstructexample.model.vo;

import java.util.Date;

public class RolVO implements Identificable<Integer> {

    private Integer idRol;
    private String nombre;
    private Date fechaAlta;

    public RolVO() {
        super();
        this.idRol = null;
        this.nombre = null;
        this.fechaAlta = null;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("RolVO{idRol=");
        sb.append(idRol);
        sb.append(", nombre=");
        sb.append(nombre);
        sb.append(", fechaAlta=");
        sb.append(fechaAlta);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Integer getId() {
        return getIdRol();
    }

    @Override
    public void setId(Integer id) {
        setIdRol(id);
    }

    @Override
    public String getIdName() {
        return "idRol";
    }

    @Override
    public boolean isNew() {
        return getIdRol() == null || getIdRol() == 0;
    }
}
