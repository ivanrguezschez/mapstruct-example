package com.irs.mapstructexample.mapper;

/**
 * Mapper que convierte un Integer a Boolean.
 * 1 = TRUE, cualquier otro valor o null = FALSE.
 * 
 * @author IRS
 * @version 1.0.0
 */
public class IntegerToBooleanMapper {
    
    public Boolean asBoolean(Integer i) {
        return i == null || i != 1 ? Boolean.FALSE : Boolean.TRUE;
    }

    public Integer asInteger(Boolean b) {
        if (b == null) {
            return null;
        }
        
        return b ? 1 : 0;
    }
}
