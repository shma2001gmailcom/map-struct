package org.misha.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.misha.Config;
import org.misha.domain.Car;
import org.misha.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class CarMapperTest {
    @Autowired
    CarMapper carMapper;

    @Test
    public void carToCarDTO() {
        Car car = new Car();
        car.setMake("BMW");
        car.setNumberOfSeats(5);
        CarDto carDto = carMapper.carToCarDTO(car);
        assertEquals(carDto.getManufacturer(), "BMW");
        assertEquals(carDto.getSeatCount(), 5);
    }
    public CarMapper getCarMapper() {
        return carMapper;
    }
}