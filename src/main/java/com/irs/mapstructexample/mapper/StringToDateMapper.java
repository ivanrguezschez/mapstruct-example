package com.irs.mapstructexample.mapper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Mapper que convierte un String a Date.
 * Formato de fecha por defecto: dd/MM/yyyy
 * 
 * También se puede usar el atributo "dateFormat" de un Mapping
 * @Mapping(source = "manufacturingDate", dateFormat = "dd/MM/yyyy")
 * 
 * @author IRS
 * @version 1.0.0
 */
public class StringToDateMapper {
    
    private static final DateFormat DATE_FORMAT_DEFAULT = new SimpleDateFormat("dd/MM/yyyy");
    
    public Date asDate(String date) {
        try {
            return date != null ? DATE_FORMAT_DEFAULT.parse(date) : null;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String asString(Date date) {
       return date != null ? DATE_FORMAT_DEFAULT.format(date) : null;
    }
}
