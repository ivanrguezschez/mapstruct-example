package com.irs.mapstructexample.model.command;

import java.util.Date;

public class UsuarioSearchCommand {

    private String nif;
    private String nombre;
    private Integer rol;
    private Integer baja;
    private Date fechaDesde;
    private Date fechaHasta;

    public UsuarioSearchCommand() {
        super();
        this.nif = null;
        this.nombre = null;
        this.rol = null;
        this.baja = null;
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

    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

    public Integer getBaja() {
        return baja;
    }

    public void setBaja(Integer baja) {
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

        sb.append("UsuarioSearchCommand{nif=");
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
