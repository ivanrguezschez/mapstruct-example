package com.irs.mapstructexample.mapper;

import com.irs.mapstructexample.model.dto.AuthorDTO;
import com.irs.mapstructexample.model.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Mapper que convierte un dto a entity y viceversa de Author.
 *
 * @author IRS
 * @version 1.0.0
 */
@Mapper(uses = {BookMapper.class})
public interface AuthorMapper extends EntityMapper<AuthorDTO, Author> {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    @Mappings({
        @Mapping(source = "idAuthor", target = "id")
    })
    Author toEntity(AuthorDTO author);

    @Mappings({
        @Mapping(source = "id", target = "idAuthor")
    })
    AuthorDTO toDto(Author author);
}
