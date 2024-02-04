package com.irs.mapstructexample.mapper;

import java.io.Serializable;
import com.irs.mapstructexample.model.vo.Identificable;
import org.mapstruct.factory.Mappers;

/**
 * Mapper que convierte un Integer a un objeto Identificable.
 * 
 * NOTA:
 * No consigo que mapstruct emplee este mapper para por ejemplo convertir un Integer a RolVO.
 * 
 * @author IRS
 * @version 1.0.0
 */
public class IdentificableMapper {
    
    public static IdentificableMapper INSTANCE = Mappers.getMapper(IdentificableMapper.class);
     
    public Identificable<Serializable> asIdentificable(Integer i) {
        Identificable<Serializable> identificable = (Identificable<Serializable>) new Object();
        
        identificable.setId(i);
        
        return identificable;
    }

    public Integer asInteger(Identificable<Serializable> identificable) {
        return identificable == null ? null : (Integer) identificable.getId();
    }
}
