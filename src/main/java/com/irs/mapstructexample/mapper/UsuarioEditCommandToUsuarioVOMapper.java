package com.irs.mapstructexample.mapper;

import com.irs.mapstructexample.model.command.UsuarioEditCommand;
import com.irs.mapstructexample.model.vo.UsuarioVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Mapper que convierte un command a vo y viceversa de UsuarioEdit y UsuarioVO.
 *
 * @author IRS
 * @version 1.0.0
 */
@Mapper(uses = { IntegerToRolMapper.class, StringToDateMapper.class})
public interface UsuarioEditCommandToUsuarioVOMapper {
    
     UsuarioEditCommandToUsuarioVOMapper INSTANCE = Mappers.getMapper(UsuarioEditCommandToUsuarioVOMapper.class);
     
    @Mappings({
        @Mapping(target = "idUsuario", source = "id")
    })
    UsuarioVO commandToVo(UsuarioEditCommand command);
    
    @Mappings({
        @Mapping(target = "id", source = "idUsuario")
    })
    UsuarioEditCommand voToCommand(UsuarioVO vo);
}
