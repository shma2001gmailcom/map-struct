package org.misha

import org.misha.domain.Car
import org.misha.mapper.CarMapper
import org.misha.mapper.CarMapperImpl
import spock.lang.Specification

class CarMapperTest extends Specification {
    def "one + one = two"() {
        expect:
        1 + 1 == 2
    }

    def "when car mapped to car dto then ok"() {
        CarMapper carMapper = new CarMapperImpl()
        given:
        def c1 = new Car()
        def c2 = new Car()
        c1.make = "BMW"
        c2.make = "GMC"
        c1.numberOfSeats = 3
        c2.numberOfSeats = 5
        expect:
        c1.make == (carMapper.carToCarDTO(c1)).manufacturer
        c1.numberOfSeats == (carMapper.carToCarDTO(c1)).seatCount
        c2.numberOfSeats == (carMapper.carToCarDTO(c2)).seatCount
        c2.make == (carMapper.carToCarDTO(c2)).manufacturer
    }
}
