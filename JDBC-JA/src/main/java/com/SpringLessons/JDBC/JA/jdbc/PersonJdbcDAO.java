package com.SpringLessons.JDBC.JA.jdbc;


import com.SpringLessons.JDBC.JA.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRawMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person =new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirth_date(rs.getTimestamp("birth_date"));
            return person;
        }
    }

    //select * from person
    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person", new PersonRawMapper());
    }

    public Person findByObjectId(int id) {
        return jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{id}, new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findByName(String name) {
        return jdbcTemplate.queryForObject("select * from person where name=?", new Object[]{name}, new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findByLocation(String location) {
        return jdbcTemplate.queryForObject("select * from person where location=?", new Object[]{location}, new BeanPropertyRowMapper<Person>(Person.class));
    }

    public int deleteByID(int id) {
        return jdbcTemplate.update("delete from person where id=?", new Object[]{id});
    }

    public int deleteByName(String name) {
        return jdbcTemplate.update("delete from person where name=?", new Object[]{name});
    }

    public int update(Person person) {
        return jdbcTemplate.update("update person "+"set name = ?, location = ?, birth_date = ? "+"where id = ?",
                new Object[]{person.getName(), person.getLocation(), new Timestamp(person.getBirth_date().getTime()), person.getId()});
    }

    public int insert(Person person) {
        return jdbcTemplate.update("insert into person(id, name, location, birth_date)" + "values(?, ?, ?, ?)",
                new Object[]{person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirth_date().getTime())});
    }
}
