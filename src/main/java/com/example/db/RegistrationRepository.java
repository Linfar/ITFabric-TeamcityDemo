package com.example.db;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by linfar on 26.10.16.
 */
public interface RegistrationRepository extends CrudRepository<Registration, Long> {
    List<Registration> findByName(String name);
}
