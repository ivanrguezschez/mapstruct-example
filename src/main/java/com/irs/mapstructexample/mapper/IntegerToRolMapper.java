package com.irs.mapstructexample.mapper;

import com.irs.mapstructexample.model.vo.RolVO;

/**
 * Mapper que convierte un Integer a RolVO.
 * 
 * @author IRS
 * @version 1.0.0
 */
public class IntegerToRolMapper {
    
    public RolVO asRol(Integer i) {
        RolVO rol = new RolVO();
        
        rol.setIdRol(i);
        
        return rol;
    }

    public Integer asInteger(RolVO rol) {
        return rol == null ? null : rol.getIdRol();
    }
}
