package com.example.demomysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
@Repository
//this will automatically create table when application start , we can also use entity manager to get data from db for that we need table structure in mysql db
public interface PersonDao extends JpaRepository<Person, Integer> {}
