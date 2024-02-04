package com.irs.mapstructexample.mapper;

import com.irs.mapstructexample.model.entity.Rol;
import com.irs.mapstructexample.model.vo.RolVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Mapper que convierte un vo a entity y viceversa de Rol.
 *
 * @author IRS
 * @version 1.0.0
 */
@Mapper
public interface RolMapper extends EntityMapper<RolVO, Rol> {

    RolMapper INSTANCE = Mappers.getMapper(RolMapper.class);

    @Mappings({
        @Mapping(target = "fechaAlta", ignore = true)
    })
    RolVO toDto(Rol rol);
}
