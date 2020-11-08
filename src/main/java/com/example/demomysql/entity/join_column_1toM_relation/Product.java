package com.example.demomysql.entity.join_column_1toM_relation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author HariomYadav
 * @since 06/11/20
 */
@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String productName;

//    //1:M
//    @OneToMany
//    @JoinColumn(name = "one_to_many_own2")
//    List<ProductTags> productList;

    //M:1
}
