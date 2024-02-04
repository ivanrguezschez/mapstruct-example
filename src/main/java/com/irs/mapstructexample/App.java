package com.irs.mapstructexample;

import com.irs.mapstructexample.mapper.AuthorMapper;
import com.irs.mapstructexample.mapper.RolMapper;
import com.irs.mapstructexample.mapper.UsuarioSearchCommandToFilterUsuarioVOMapper1;
import com.irs.mapstructexample.mapper.UsuarioSearchCommandToFilterUsuarioVOMapper2;
import com.irs.mapstructexample.mapper.UsuarioEditCommandToUsuarioVOMapper;
import com.irs.mapstructexample.mapper.UsuarioMapper;
import com.irs.mapstructexample.model.command.UsuarioSearchCommand;
import com.irs.mapstructexample.model.command.UsuarioEditCommand;
import com.irs.mapstructexample.model.entity.Rol;
import com.irs.mapstructexample.model.entity.Usuario;
import com.irs.mapstructexample.model.vo.UsuarioVO;
import com.irs.mapstructexample.model.vo.RolVO;
import com.irs.mapstructexample.model.vo.FilterUsuarioVO;
import java.util.Calendar;
import java.util.Date;
import com.irs.mapstructexample.mapper.UsuarioVOToUsuarioMapper;
import com.irs.mapstructexample.model.dto.AuthorDTO;
import com.irs.mapstructexample.model.dto.BookDTO;
import com.irs.mapstructexample.model.entity.Author;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Ejemplo para transformar el valor de un objeto en otro.
 * 
 * @author IRS
 * @version 1.0.0
 */
public class App {

    public static void main(String[] args) {
        try {
            voToEntity();
            System.out.println("---------------------------------------------");
            searchCommandToVo();
            System.out.println("---------------------------------------------");
            editCommandToVo();
            
            System.out.println("---------- EntityMapper Examples ----------");
            entityMapperExample1();
            System.out.println("---------------------------------------------");
            entityMapperExample2();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void voToEntity() {
        Date today = Calendar.getInstance().getTime();

        RolVO rolVo = new RolVO();
        rolVo.setIdRol(1);
        rolVo.setNombre("ADMIN");
        rolVo.setFechaAlta(today);

        UsuarioVO usuarioVo = new UsuarioVO();
        usuarioVo.setIdUsuario(100);
        usuarioVo.setNif("00000003A");
        usuarioVo.setNombre("NOMBRE-01");
        usuarioVo.setApellido1("APELLIDO1-01");
        usuarioVo.setApellido2("APELLIDO2-01");
        usuarioVo.setFechaAlta(today);
        usuarioVo.setRol(rolVo);

        Usuario usuarioEntity = UsuarioVOToUsuarioMapper.INSTANCE.voToEntity(usuarioVo);

        System.out.println("Transformando UsuarioVO a Usuario");
        System.out.println("usuarioVo:" + usuarioVo);
        System.out.println("usuario:" + usuarioEntity);
        System.out.println();

        Rol rolEntity = new Rol();
        rolEntity.setIdRol(2);
        rolEntity.setNombre("USER");

        usuarioEntity.setFechaAlta(today);
        usuarioEntity.setNombre("NOMBRE-99");
        //usuarioEntity.setRol(null);
        usuarioEntity.setRol(rolEntity);

        usuarioVo = UsuarioVOToUsuarioMapper.INSTANCE.entityToVo(usuarioEntity);

        System.out.println("Transformando Usuario a UsuarioVO");
        System.out.println("usuario:" + usuarioEntity);
        System.out.println("usuarioVo:" + usuarioVo);
        System.out.println();
    }

    private static void searchCommandToVo() {
        Date today = Calendar.getInstance().getTime();

        UsuarioSearchCommand usuarioSearchCommand1 = new UsuarioSearchCommand();
        usuarioSearchCommand1.setNif("0000001R");
        usuarioSearchCommand1.setNombre("nombre-01");
        usuarioSearchCommand1.setRol(1);
        usuarioSearchCommand1.setBaja(1);
        usuarioSearchCommand1.setFechaDesde(today);
        usuarioSearchCommand1.setFechaHasta(today);

        FilterUsuarioVO filterUsuario1 = UsuarioSearchCommandToFilterUsuarioVOMapper1.INSTANCE.commandToVo(usuarioSearchCommand1);

        System.out.println("Transformando UsuarioSearchCommand a FilterUsuarioVO");
        System.out.println("usuarioSearchCommand:" + usuarioSearchCommand1);
        System.out.println("filterUsuario:" + filterUsuario1);
        System.out.println();

        filterUsuario1.setRol(null);
        filterUsuario1.setBaja(Boolean.FALSE);
        //filterUsuario1.setNombre(filterUsuario1.getNombre().toUpperCase());
        filterUsuario1.setNombre(filterUsuario1.getNombre().toLowerCase());
        filterUsuario1.setFechaDesde(today);
        filterUsuario1.setFechaHasta(today);

        usuarioSearchCommand1 = UsuarioSearchCommandToFilterUsuarioVOMapper1.INSTANCE.voToCommand(filterUsuario1);

        System.out.println("Transformando FilterUsuarioVO a UsuarioSearchCommand");
        System.out.println("usuarioSearchCommand:" + usuarioSearchCommand1);
        System.out.println("filterUsuario:" + filterUsuario1);
        System.out.println();

        UsuarioSearchCommand usuarioSearchCommand2 = new UsuarioSearchCommand();
        usuarioSearchCommand2.setNif("0000001R");
        usuarioSearchCommand2.setNombre("nombre-01");
        usuarioSearchCommand2.setRol(1);
        usuarioSearchCommand2.setBaja(1);
        usuarioSearchCommand2.setFechaDesde(today);
        usuarioSearchCommand2.setFechaHasta(today);

        FilterUsuarioVO filterUsuario2 = UsuarioSearchCommandToFilterUsuarioVOMapper2.INSTANCE.commandToVo(usuarioSearchCommand2);

        System.out.println("Transformando UsuarioSearchCommand a FilterUsuarioVO");
        System.out.println("usuarioSearchCommand:" + usuarioSearchCommand2);
        System.out.println("filterUsuario:" + filterUsuario2);
        System.out.println();

        filterUsuario2.setRol(null);
        filterUsuario2.setBaja(Boolean.FALSE);
        filterUsuario2.setNombre(filterUsuario2.getNombre().toUpperCase());
        filterUsuario2.setFechaDesde(today);
        filterUsuario2.setFechaHasta(today);

        usuarioSearchCommand2 = UsuarioSearchCommandToFilterUsuarioVOMapper2.INSTANCE.voToCommand(filterUsuario2);

        System.out.println("Transformando FilterUsuarioVO a UsuarioSearchCommand");
        System.out.println("usuarioSearchCommand:" + usuarioSearchCommand2);
        System.out.println("filterUsuario:" + filterUsuario2);
        System.out.println();
    }

    private static void editCommandToVo() {
        Date today = Calendar.getInstance().getTime();
         
        UsuarioEditCommand usuarioEditCommand = new UsuarioEditCommand();
        usuarioEditCommand.setId(1);
        usuarioEditCommand.setNif("0000001R");
        usuarioEditCommand.setNombre("nombre-01");
        usuarioEditCommand.setApellido1("apellido1-01");
        usuarioEditCommand.setApellido2("apellido1-02");
        usuarioEditCommand.setRol(1);
        usuarioEditCommand.setFechaAlta("28/08/2019");

        UsuarioVO usuarioVo = UsuarioEditCommandToUsuarioVOMapper.INSTANCE.commandToVo(usuarioEditCommand);

        System.out.println("Transformando UsuarioEditCommand a UsuarioVO");
        System.out.println("usuarioEditCommand:" + usuarioEditCommand);
        System.out.println("usuarioVo:" + usuarioVo);
        System.out.println();

        usuarioVo.setFechaAlta(today);
        usuarioVo.setRol(null);
        
        usuarioEditCommand = UsuarioEditCommandToUsuarioVOMapper.INSTANCE.voToCommand(usuarioVo);

        System.out.println("Transformando UsuarioVO a UsuarioEditCommand");
        System.out.println("usuarioEditCommand:" + usuarioEditCommand);
        System.out.println("usuarioVo:" + usuarioVo);
        System.out.println();
    }

    private static void entityMapperExample1() {
        Date today = Calendar.getInstance().getTime();

        RolVO rolVo1 = new RolVO();
        rolVo1.setIdRol(1);
        rolVo1.setNombre("ADMIN");
        rolVo1.setFechaAlta(today);
        
        RolVO rolVo2 = new RolVO();
        rolVo2.setIdRol(2);
        rolVo2.setNombre("USER");
        rolVo2.setFechaAlta(today);
        
        List<RolVO> rolVoList = Arrays.asList(rolVo1, rolVo2);
        
        List<Rol> rolEntityList = RolMapper.INSTANCE.toEntity(rolVoList);
        
        System.out.println("Transformando List RolVO a List RolEntity");
        rolVoList.stream().forEach(System.out::println);
        rolEntityList.stream().forEach(System.out::println);
        System.out.println();
        
        UsuarioVO usuarioVo1 = new UsuarioVO();
        usuarioVo1.setIdUsuario(1);
        usuarioVo1.setNif("00000003A");
        usuarioVo1.setNombre("NOMBRE-01");
        usuarioVo1.setApellido1("APELLIDO1-01");
        usuarioVo1.setApellido2("APELLIDO2-01");
        usuarioVo1.setFechaAlta(today);
        usuarioVo1.setRol(rolVo1);
        
        UsuarioVO usuarioVo2 = new UsuarioVO();
        usuarioVo2.setIdUsuario(2);
        usuarioVo2.setNif("00000001R");
        usuarioVo2.setNombre("NOMBRE-02");
        usuarioVo2.setApellido1("APELLIDO1-02");
        usuarioVo2.setApellido2("APELLIDO2-02");
        usuarioVo2.setFechaAlta(today);
        usuarioVo2.setRol(rolVo2);
        
        List<UsuarioVO> usuarioVoList = Arrays.asList(usuarioVo1, usuarioVo2);
        
        List<Usuario> usuarioEntityList = UsuarioMapper.INSTANCE.toEntity(usuarioVoList);
        
        System.out.println("Transformando List UsuarioVO a List UsuarioEntity");
        usuarioVoList.stream().forEach(System.out::println);
        usuarioEntityList.stream().forEach(System.out::println);
        System.out.println();
    }
    
      private static void entityMapperExample2() {
        Date today = Calendar.getInstance().getTime();

        BookDTO bookDto1 = new BookDTO();
        bookDto1.setIdBook(1L);
        bookDto1.setTitle("DTOs Are Awesome!");
        bookDto1.setReleaseDate(today);

        BookDTO bookDto2 = new BookDTO();
        bookDto2.setIdBook(2L);
        bookDto2.setTitle("9 Keys To Academic Success");
        bookDto2.setReleaseDate(today);
        
        BookDTO bookDto3 = new BookDTO();
        bookDto3.setIdBook(3L);
        bookDto3.setTitle("The Adventure");
        bookDto3.setReleaseDate(today);
                
        Set<BookDTO> books = new HashSet<>(Arrays.asList(bookDto1, bookDto2, bookDto3));
        
        AuthorDTO authorDto1 = new AuthorDTO();
        authorDto1.setIdAuthor(1L);
        authorDto1.setName("James");
        authorDto1.setSurname("Smith");
        authorDto1.setBirthDate(new Date(64, 6, 1));
        authorDto1.setBooks(books);
                        
        Author autorEntity1 = AuthorMapper.INSTANCE.toEntity(authorDto1);
        
        System.out.println("Transformando AuthorDTO a AuthorEntity");
        System.out.println("authorDto1: " + authorDto1);
        System.out.println("autorEntity1: " + autorEntity1);
        System.out.println();
    }
}
