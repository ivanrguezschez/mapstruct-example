package com.irs.mapstructexample.mapper;

import java.util.Calendar;
import java.util.Date;
import org.mapstruct.Named;

/**
 * Clase Mapper de utilidad para convierte un Date a Date From (00:00:00 y Date To (23:59:59).
 * 
 * @author IRS
 * @version 1.0.0
 */
@Named("DateTranslator")
public class DateTranslator {
    
    @Named("FromDate")
    public Date fromDate(Date date) {
        Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
				
        // Añado la hora a 00:00:00
	calendar.set(Calendar.HOUR_OF_DAY, 0);
	calendar.set(Calendar.MINUTE, 0);
	calendar.set(Calendar.SECOND, 0);
				
	return calendar.getTime();
    }
    
    @Named("ToDate")
    public Date toDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
				
	// Añado la hora a 23:59:59
	calendar.set(Calendar.HOUR_OF_DAY, 23);
	calendar.set(Calendar.MINUTE, 59);
	calendar.set(Calendar.SECOND, 59);
				
	return calendar.getTime();
    }
}
