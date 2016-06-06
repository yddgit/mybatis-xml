package com.my.project.mapper;
import org.apache.ibatis.annotations.Mapper;

import com.my.project.domain.Hotel;

@Mapper
public interface HotelMapper {

	Hotel selectByCityId(int city_id);

}