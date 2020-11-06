package com.example.demomysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demomysql.entity.Location;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
@Repository
public interface LocationDao extends JpaRepository<Location, Integer> {}
