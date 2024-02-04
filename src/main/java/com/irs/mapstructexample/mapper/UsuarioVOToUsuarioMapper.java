package com.irs.mapstructexample.mapper;

import com.irs.mapstructexample.model.entity.Usuario;
import com.irs.mapstructexample.model.vo.UsuarioVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Mapper que convierte un vo a entity y viceversa de Usuario.
 * 
 * @author IRS
 * @version 1.0.0
 */
@Mapper
public interface UsuarioVOToUsuarioMapper {
   
    UsuarioVOToUsuarioMapper INSTANCE = Mappers.getMapper(UsuarioVOToUsuarioMapper.class);
    
    /**
     * Convierte un vo de usuario a entity de usuario.
     * @param vo Value Objet de usuario.
     * @return Entity de usuario.
     */
    @Mappings({
        @Mapping(target = "fechaAlta", ignore = true)
    })
    Usuario voToEntity(UsuarioVO vo);
      
    /**
     * Convierte una entity de usuario a un vo de usuario.
     * @param entity Entity de usuario.
     * @return Value Objet de usuario.
     */
    @Mappings({
        @Mapping(target = "fechaAlta", ignore = true)
    })
    UsuarioVO entityToVo(Usuario entity);
}
