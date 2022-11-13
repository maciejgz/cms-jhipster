package pl.mg.cms.service.mapper;

import org.mapstruct.*;
import pl.mg.cms.domain.Book;
import pl.mg.cms.service.dto.BookDTO;

/**
 * Mapper for the entity {@link Book} and its DTO {@link BookDTO}.
 */
@Mapper(componentModel = "spring")
public interface BookMapper extends EntityMapper<BookDTO, Book> {}
