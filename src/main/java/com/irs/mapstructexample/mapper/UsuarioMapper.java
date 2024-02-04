package com.irs.mapstructexample.mapper;

import com.irs.mapstructexample.model.entity.Usuario;
import com.irs.mapstructexample.model.vo.UsuarioVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper que convierte un vo a entity y viceversa de Usuario.
 *
 * @author IRS
 * @version 1.0.0
 */
@Mapper(uses = {RolMapper.class})
public interface UsuarioMapper extends EntityMapper<UsuarioVO, Usuario> {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
}
