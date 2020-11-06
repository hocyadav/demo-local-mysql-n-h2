package com.example.demomysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demomysql.entity.join_column_MtoM_relation_using_mappedBy.Email;

/**
 * @author HariomYadav
 * @since 06/11/20
 */
@Repository
public interface EmailDao extends JpaRepository<Email, Integer> {}
