package com.SpringLessons.JDBC.JA.SpringData;

import com.SpringLessons.JDBC.JA.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
