package org.student.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.student.domain.City;

@Mapper
interface CityMapper {

    String GET_CITY = "org.student.mapper.CityMapper.getCity";

    @Select("SELECT id, name FROM city where id=#{id}")
    City getCity(Integer id);

}
