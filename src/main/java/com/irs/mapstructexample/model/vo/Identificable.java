package com.irs.mapstructexample.model.vo;

import java.io.Serializable;

/**
 * Interface para la identificacion de vo's.
 *
 * @param <ID> Identificador.
 *
 * @author IRS
 * @version 1.0.0
 */
public interface Identificable<ID extends Serializable> {

    /**
     * Método que devuelve el campo identificador.
     *
     * @return El campo identificador.
     */
    ID getId();

    /**
     * Método que estable el campo identificador.
     *
     * @param id el campo identificador.
     */
    void setId(ID id);

    /**
     * Método que devuelve el nombre del campo identificador.
     *
     * @return El nombre del campo identificador.
     */
    String getIdName();

    /**
     * Indica si el objeto identifiable es nuevo (true) o no (false).
     *
     * @return true si el objeto identifiable es nueva o false si no lo es.
     */
    boolean isNew();
}
