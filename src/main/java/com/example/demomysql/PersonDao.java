package com.example.demomysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {}
