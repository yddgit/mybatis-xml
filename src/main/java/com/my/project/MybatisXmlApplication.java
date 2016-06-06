package com.my.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.my.project.dao.CityDao;
import com.my.project.mapper.HotelMapper;

@SpringBootApplication
@PropertySource("classpath:mappers.properties")
public class MybatisXmlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MybatisXmlApplication.class, args);
	}

	@Autowired
	private CityDao cityDao;

	@Autowired
	private HotelMapper hotelMapper;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.cityDao.selectCityById(1));
		System.out.println(this.hotelMapper.selectByCityId(1));
	}
}
