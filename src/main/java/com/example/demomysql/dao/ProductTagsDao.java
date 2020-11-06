package com.example.demomysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demomysql.entity.join_column_1toM_relation.ProductTags;

/**
 * @author HariomYadav
 * @since 06/11/20
 */
@Repository
public interface ProductTagsDao extends JpaRepository<ProductTags, Integer> {}
