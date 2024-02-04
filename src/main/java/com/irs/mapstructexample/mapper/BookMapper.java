package com.irs.mapstructexample.mapper;

import com.irs.mapstructexample.model.dto.BookDTO;
import com.irs.mapstructexample.model.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Mapper que convierte un dto a entity y viceversa de Book.
 *
 * @author IRS
 * @version 1.0.0
 */
@Mapper(uses = {AuthorMapper.class})
public interface BookMapper extends EntityMapper<BookDTO, Book> {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mappings({
        @Mapping(source = "idBook", target = "id")
    })
    Book toEntity(BookDTO book);

    @Mappings({
        @Mapping(source = "id", target = "idBook")
    })
    BookDTO toDto(Book book);
}
