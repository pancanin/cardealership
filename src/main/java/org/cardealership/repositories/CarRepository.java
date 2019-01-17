package org.cardealership.repositories;

import org.cardealership.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> findAllByMakeOrderByModelAscTravelledDistanceDesc(String make);
}
