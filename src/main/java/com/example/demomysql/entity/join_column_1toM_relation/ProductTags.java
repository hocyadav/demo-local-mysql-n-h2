package com.example.demomysql.entity.join_column_1toM_relation;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
    @OneToMany (fetch = FetchType.LAZY)//3 relation from this table to FK table
    @JoinColumn (name = "many_to_one_own_column1")//2. 1st table name PK will store in this colum name : column name + store PK of FK
        List<Product> product;//1 table name

//join column simply means join new column in table, it may be in current entity table or may be in other entity table that have relation
//in case of m:1(see case 1, 2, 2.1 all are same just column name change in currnt entity) new column will create in own entity table
// in case of 1:m(see case A, B, C) new column will create in other entity table enven we have mention join column here

    // case 1:
    //1. annotation relation mapping : 1:M or M:1..check for 1:m same behaviour
    //2. field type
    //output : (not create 3rd table) in current table create new column = column name => above all fields + new field as field name + pk name
//    @ManyToOne(fetch = FetchType.LAZY)
//    Product product;


    // case 2 //valid use case - widely used
    //1. annotation relation mapping : 1:M or M:1
    //1.2 : annotation join column :
    //2. field type
    //output : (not create 3rd table)  above all fields + new field as field name + pk name..same as case 1
    //    @ManyToOne(fetch = FetchType.LAZY)
    //    @JoinColumn
    //    Product product;

    // case 2.1
    //1. annotation relation mapping : 1:M or M:1
    //1.2 : annotation join column + add name (define own column name)
    //2. field type
    //output : (not create 3rd table)  above all fields + new field as field name + pk name..same as case 1
    //    @ManyToOne(fetch = FetchType.LAZY)
    //    @JoinColumn(name = "column_name1")
    //    Product product;

    //case A: 1:M
    //1. annotation relation mapping
    //2. field type
    //output : create a 3rd table
//    @OneToMany (fetch = FetchType.LAZY)
//    List<Product> productList;//1 table name

    //case B: 1:M
    //1. annotation relation mapping
    //2. field type
    //output : create new column in another entity with name current entity field name + pk
    //    @OneToMany (fetch = FetchType.LAZY)
    //    @JoinColumn
    //    List<Product> productList;//1 table name

    //case C: 1:M
    //1. annotation relation mapping
    //2. field type
    //output : same as B but with our our colunn name
    //    @OneToMany (fetch = FetchType.LAZY)
    //    @JoinColumn(name = "column_name2")
    //    List<Product> productList;//1 table name







}
