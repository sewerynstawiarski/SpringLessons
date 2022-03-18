package com.SpringLessons.JDBC.JA.jpa;


import com.SpringLessons.JDBC.JA.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.awt.*;
import java.util.List;

//Repository
@Repository
//Transaction management
@Transactional
public class PersonJpaRepository {
    //connect to the database
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id); //JPA
    }

   public List<Person> findByName(String name) {
        return entityManager.createQuery("SELECT p FROM Person p WHERE p.name LIKE :name").setParameter("name", name).getResultList();
    }

    public Person insert(Person person) {
        return entityManager.merge(person); // merge can be used for insert and updating
    }
    public void deleteById(int id) { // it's void method!
        Person person = findById(id); // first you need to create an object of the class
        entityManager.remove(person);   // then remove
    }
    public List<Person> findAll() {
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();
    }
}
