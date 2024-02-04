package com.irs.mapstructexample.model.vo;

import java.util.Date;

public class FilterUsuarioVO {

    private String nif;
    private String nombre;
    private RolVO rol;
    private boolean baja;
    private Date fechaDesde;
    private Date fechaHasta;

    public FilterUsuarioVO() {
        super();
        this.nif = null;
        this.nombre = null;
        this.rol = null;
        this.baja = false;
        this.fechaDesde = null;
        this.fechaHasta = null;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RolVO getRol() {
        return rol;
    }

    public void setRol(RolVO rol) {
        this.rol = rol;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("FilterUsuarioVO{nif=");
        sb.append(nif);
        sb.append(", nombre=");
        sb.append(nombre);
        sb.append(", rol=");
        sb.append(rol);
        sb.append(", baja=");
        sb.append(baja);
        sb.append(", fechaDesde=");
        sb.append(fechaDesde);
        sb.append(", fechaHasta=");
        sb.append(fechaHasta);
        sb.append("}");

        return sb.toString();
    }
}
