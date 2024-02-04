package com.irs.mapstructexample.mapper;

import com.irs.mapstructexample.model.command.UsuarioSearchCommand;
import com.irs.mapstructexample.model.vo.FilterUsuarioVO;
import com.irs.mapstructexample.model.vo.RolVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

/**
 * Mapper que convierte un command a filter vo y viceversa de UsuarioSearch y FilterUsuarioVO.
 * Alternativa 2:
 * Hace uso de dos métodos @Named para transformar un Integer a RolVO y viceversa.
 * Estos métodos se pueden llevar a una clase IntegerToRolMapper, RolMapper o MapperUtil, por ejemplo,
 * como hiciste con "fechaDesde" y fechaHasta", así se pueden usar en mas mappers.
 *
 * @author IRS
 * @version 1.0.0
 */
@Mapper(uses = { IntegerToBooleanMapper.class, DateTranslator.class })
public interface UsuarioSearchCommandToFilterUsuarioVOMapper2 {

    UsuarioSearchCommandToFilterUsuarioVOMapper2 INSTANCE = Mappers.getMapper(UsuarioSearchCommandToFilterUsuarioVOMapper2.class);

    @Mapping(target = "nombre", expression = "java( new String(command.getNombre()).toUpperCase() )" )
    @Mapping(source = "rol", target = "rol", qualifiedByName = "integerToRolVO")
    @Mapping(target = "fechaDesde", qualifiedByName = { "DateTranslator", "FromDate" } )
    @Mapping(target = "fechaHasta", qualifiedByName = { "DateTranslator", "ToDate" } )
    FilterUsuarioVO commandToVo(UsuarioSearchCommand command);

    @Mapping(source = "rol", target = "rol", qualifiedByName = "rolVOToInteger")
    UsuarioSearchCommand voToCommand(FilterUsuarioVO vo);

    @Named("integerToRolVO")
    default RolVO rolVOToInteger(Integer i) {
        RolVO rol = new RolVO();

        rol.setIdRol(i);

        return rol;
    }

    @Named("rolVOToInteger")
    default Integer rolVOToInteger(RolVO rol) {
        return rol == null ? null : rol.getIdRol();
    }
}
