package org.misha.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.misha.domain.Car;
import org.misha.domain.Person;
import org.misha.dto.CarDto;
import org.misha.dto.PersonDto;

@Mapper(componentModel = "spring")
public interface CarMapper {
    @Mappings({
                      @Mapping(source = "make", target = "manufacturer"),
                      @Mapping(source = "numberOfSeats", target = "seatCount")
              })
    CarDto carToCarDTO(Car car);

    @Mapping(source = "name", target = "fullName")
    PersonDto personToPersonDto(Person person);
}
