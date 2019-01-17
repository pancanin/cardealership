package org.cardealership.repositories;

import org.cardealership.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public List<Customer> findAllByOrderByBirthDateAscIsYoungDriverAsc();

    public List<Customer> findAllByOrderByBirthDateDescIsYoungDriverDesc();
}
