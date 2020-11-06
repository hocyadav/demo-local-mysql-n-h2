package com.example.demomysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demomysql.entity.Person;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
@Repository
//this will automatically create table when application start , we can also use entity manager to get data from db for that we need table structure in mysql db
public interface PersonDao extends JpaRepository<Person, Integer> {}
