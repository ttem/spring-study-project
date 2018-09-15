package org.student.mapper;

import org.apache.ibatis.annotations.*;
import org.student.domain.Author;

import java.util.List;

@Mapper
public interface AuthorMapper {

    String GET_AUTHOR = "org.student.mapper.AuthorMapper.getAuthor";

    @Select("SELECT id, surname, city_id_fk FROM author where id=#{id}")
    @Results(value = {
            @Result(property = "city", column = "city_id_fk", one = @One(select = CityMapper.GET_CITY))
    })
    Author getAuthor(Integer id);

    @Select("SELECT id, surname, city_id_fk FROM author")
    @Results(value = {
            @Result(property = "city", column = "city_id_fk", one = @One(select = CityMapper.GET_CITY))
    })
    List<Author> getAllAuthors();
}
