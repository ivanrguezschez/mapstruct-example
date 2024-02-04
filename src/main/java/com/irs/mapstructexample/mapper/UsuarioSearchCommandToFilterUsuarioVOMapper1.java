package com.irs.mapstructexample.mapper;

import com.irs.mapstructexample.model.command.UsuarioSearchCommand;
import com.irs.mapstructexample.model.vo.FilterUsuarioVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Mapper que convierte un command a filter vo y viceversa de UsuarioSearch y FilterUsuarioVO.
 * Alternativa 1:
 * Hace uso del mapper IntegerToRolMapper para transformar un Integer a RolVO y viceversa.
 *
 * @author IRS
 * @version 1.0.0
 */
@Mapper(uses = { IntegerToRolMapper.class, IntegerToBooleanMapper.class, DateTranslator.class })
public interface UsuarioSearchCommandToFilterUsuarioVOMapper1 {

    UsuarioSearchCommandToFilterUsuarioVOMapper1 INSTANCE = Mappers.getMapper(UsuarioSearchCommandToFilterUsuarioVOMapper1.class);

    @Mapping(target = "nombre", expression = "java( new String(command.getNombre()).toUpperCase() )" )
    @Mapping(target = "fechaDesde", qualifiedByName = { "DateTranslator", "FromDate" } )
    @Mapping(target = "fechaHasta", qualifiedByName = { "DateTranslator", "ToDate" } )
    FilterUsuarioVO commandToVo(UsuarioSearchCommand command);

    UsuarioSearchCommand voToCommand(FilterUsuarioVO vo);
}
