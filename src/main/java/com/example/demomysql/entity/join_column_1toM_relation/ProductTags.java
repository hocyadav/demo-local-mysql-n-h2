package com.example.demomysql.entity.join_column_1toM_relation;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author HariomYadav
 * @since 06/11/20
 */
@Data
@Entity
@Table (name = "products_tag")
public class ProductTags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String tagName;

    //working - JPA will not create 3rd relation table  
    @ManyToOne(fetch = FetchType.LAZY)//3 relation from this table to FK table
    @JoinColumn(name = "product_tags_own_column")//2. 1st table name PK will store in this colum name : column name + store PK of FK
            Product product;//1 table name

}
